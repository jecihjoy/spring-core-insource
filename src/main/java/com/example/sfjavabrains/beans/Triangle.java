package com.example.sfjavabrains.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements Shape,ApplicationContextAware, BeanNameAware, InitializingBean, DisposableBean {

    public Point pointA;
    private Point pointB;
    private Point pointC;
    private ApplicationContext context = null;

    public Point getPointA() {
        return pointA;
    }

    @Required
    @Autowired
    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    @Override
    public void draw() {
        System.out.println("Point A = " + getPointA().getX() + "," + getPointA().getY());
        System.out.println("Point B = " + getPointB().getX() + "," + getPointB().getY());
        System.out.println("Point C = " + getPointC().getX() + "," + getPointC().getY());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
        Point pointA = (Point) this.context.getBean("pointA");
        System.out.println("ApplicationContextAware Example: " + pointA.getX() + " "+ pointA.getY());
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Current bean name " + s);
    }

    /*called after bean initialization*/
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing bean method called in bean triangle");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Called before destroying bean triangle");
    }

    public void myInit() {
        System.out.println("my init triable");
    }

    public void beanCleanup() {
        System.out.println("destroy triangle");
    }
}
