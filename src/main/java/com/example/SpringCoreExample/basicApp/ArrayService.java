package com.example.SpringCoreExample.basicApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.inject.Named;

@Service
public class ArrayService {

    @Value("${external.service.url}")
    private String serverUrl;

    @Autowired
    private ArrayDao arrayDao;

    public int getSum(){
        int[] data = arrayDao.getData();
        int sum = 0;
        for (int value : data) {
            sum += value;
        }
        return sum;
    }

    public void getServerUrl(){
        System.out.println("Reading .properties file values "+serverUrl);
    }
}
