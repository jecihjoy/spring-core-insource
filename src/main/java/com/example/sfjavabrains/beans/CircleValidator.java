package com.example.sfjavabrains.beans;

import com.example.sfjavabrains.annotation.Handler;
import com.example.sfjavabrains.beans.Circle;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Handler(supports = { Circle.class }, order = 50)
@Component
public class CircleValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return Circle.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Point circle = (Point) o;
        try {
            if (circle.getX() == 0 || circle.getX() == 0) {
                errors.reject("Circle center cannot be null");
            }
        } catch (Exception e) {
            errors.reject(e.getMessage());
        }
    }
}
