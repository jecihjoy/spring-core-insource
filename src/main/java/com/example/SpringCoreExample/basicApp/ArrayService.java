package com.example.SpringCoreExample.basicApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.inject.Named;

@Service
public class ArrayService {

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
}
