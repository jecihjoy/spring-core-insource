package com.example.sfjavabrains.annotation;

import java.lang.annotation.*;

@Target( { ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Handler {

    Class<?>[] supports() default {};

    int order() default Integer.MAX_VALUE;

}
