package com.example.SpringCoreExample.basicApp;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import javax.inject.Named;

@Named
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ArrayDao {

    public int[] getData()
    {
        return new int[] { 1, 2, 3, 4, 5, 6 };
    }

}
