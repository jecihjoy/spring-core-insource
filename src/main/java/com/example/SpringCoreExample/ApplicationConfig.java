package com.example.SpringCoreExample;

import com.example.SpringCoreExample.basicApp.ArrayDao;
import com.example.SpringCoreExample.basicApp.ArrayService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:app.properties")
@ComponentScan("com.example.SpringCoreExample")
public class ApplicationConfig {

    @Value("${app.val}")
    private String testEnvironmentVar;

    @Bean
    @Profile("Prod")
    public ArrayService arrayService() {
        return new ArrayService(testEnvironmentVar);
    }

    @Bean
    @Profile("!Prod")
    public ArrayService arrayServiceDev() {
        return new ArrayService("This is dev environment");
    }

    @Bean
    public ArrayDao arrayDao() {
        return new ArrayDao();
    }
}
