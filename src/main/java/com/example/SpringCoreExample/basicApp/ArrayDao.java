package com.example.SpringCoreExample.basicApp;

import javax.inject.Named;

@Named
public class ArrayDao {
    public int[] getData() {
        return new int[] { 1, 2, 3, 4, 5, 6 };
    }
}
