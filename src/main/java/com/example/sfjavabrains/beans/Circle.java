package com.example.sfjavabrains.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Locale;

@Component
public class Circle implements Shape {

    @Autowired
    private Point center;

    @Autowired
    private MessageSource messageSource;

    @Autowired
    private CircleValidator circleValidator;

    public Point getCenter() {
        return center;
    }

    @Override
    public void draw() {
//        circleValidator.validate(center, null);
        Locale locale = new Locale("en", "US");
        System.out.println(messageSource.getMessage("drawing.circle", null, "Default drawing message", locale) + "With center coordinates " + this.center.getX() + this.center.getY());
        System.out.println("Messaging and internationalization: " + messageSource.getMessage("message", null, "Am a pro", locale));
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
