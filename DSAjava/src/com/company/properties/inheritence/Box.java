package com.company.properties.inheritence;

public class Box {
    double l;
    double h;
    double w;
    // double weight;
    static void greeting(){
        System.out.println("Hey , I am in Box class . Greetings!");
    }
    public double getL(){
        return l;
    }
    Box(){
        // Box class constructor..
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }
    Box(double side){
        this.w = side;
        this.h = side;
        this.l = side;

    }
    Box(double l,double w,double h){
        System.out.println("Box class constructor");
        this.w = w;
        this.l = l;
        this.h = h;
    }
    Box(Box other){
        this.l = other.l;
        this.h = other.h;
        this.w = other.h;
    }




}
