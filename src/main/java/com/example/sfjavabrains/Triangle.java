package com.example.sfjavabrains;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware {

    private Point pointA;
    private Point pointB;
    private Point pointC;
    private ApplicationContext context = null;

    public Point getPointA() {
        return pointA;
    }

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

    public void draw() {
        System.out.println("Point A = " + getPointA().getX() + "," +getPointA().getY());
        System.out.println("Point B = " + getPointB().getX() + "," +getPointB().getY());
        System.out.println("Point C = " + getPointC().getX() + "," +getPointC().getY());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
        Point pointA = (Point) this.context.getBean("pointA");
        System.out.println("POINT A point: " + pointA.getX() + pointA.getY());
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Current bean name " + s);
    }
}
