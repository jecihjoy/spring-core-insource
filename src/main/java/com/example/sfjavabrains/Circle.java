package com.example.sfjavabrains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Circle implements Shape{

    @Autowired
    private Point center;

    @Autowired
    private MessageSource messageSource;

    @Override
    public void draw() {
        System.out.println(messageSource.getMessage("drawing.circle", null, "Default drawing message", null));
        System.out.println("Messaging and internationalization: " + messageSource.getMessage("message", null, "Am a pro", null));
    }

    @PostConstruct
    public void myInit() {
        System.out.println("my init circle");
    }

    @PreDestroy
    public void beanCleanup() {
        System.out.println("destroy circle");
    }
}
