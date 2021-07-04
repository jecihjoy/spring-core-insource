package com.example.SpringCoreExample;

import com.example.SpringCoreExample.basicApp.ArrayDao;
import com.example.SpringCoreExample.basicApp.ArrayService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:app.properties")
@ComponentScan("com.example.SpringCoreExample")
public class ApplicationConfig {

    @Value("${app.val}")
    private String testEnvironmentVar;

    @Value("#{new Boolean(environment['spring.profiles.active']!='Dev')}")
    private Boolean isProdProfile;

    @Bean
    public ArrayService arrayService() {
        if(!isProdProfile) {
            testEnvironmentVar = "This is dev environment";
        }
        return new ArrayService(testEnvironmentVar);
    }

    @Bean
    public ArrayDao arrayDao() {
        return new ArrayDao();
    }
}
