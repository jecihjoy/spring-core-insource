package com.example.SpringCoreExample.basicApp;

import org.springframework.beans.factory.annotation.Autowired;
import javax.inject.Named;

@Named
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
