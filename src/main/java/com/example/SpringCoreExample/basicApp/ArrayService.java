package com.example.SpringCoreExample.basicApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

//@Service
public class ArrayService {

    private final String environmentVar;

    @Value("${app.serverUrl}")
    private String serverUrl;

    @Autowired
    private ArrayDao arrayDao;

    public ArrayService(String environmentVar) {
        this.environmentVar = environmentVar;
    }

    public int getSum(){
        printValue();

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

    public void printValue() {
        System.out.println("Test environment variable " + environmentVar);
    }
}
