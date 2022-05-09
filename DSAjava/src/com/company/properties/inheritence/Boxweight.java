package com.company.properties.inheritence;

import java.util.ArrayList;

public class Boxweight extends Box{
    double weight;
    public Boxweight(){
        this.weight = -1;
    }
    static void greeting(){
        System.out.println("Hey , I am in Boxweight class. Greetings!");
        ArrayList list = new ArrayList();
    }
//    Boxweight(Boxweight other){
//        super(other);
//        weight = other.weight;
//    }
    Boxweight(double side,double weight){
        super(side);
        this.weight = weight;
    }

    Boxweight(Boxweight other){
        super(other);
        weight = other.weight;

    }
    public Boxweight(double l,double h,double w,double weight){
        // used to initialize values present in parent class
        super(l,w,h);
//        System.out.println(this.h);
//        super.height is used if you want to access the weight variable of super class and not of parent class
//        whereas if you want to use the variable weight of parentclass then you can use this.weight to access it
//        System.out.println(super.weight);
// if super was not called the default constructor with no parameters would be called
        this.weight = weight;
// note : super class cannot be called later after the initialisation because super class should be called first as the parent class should know what should happen later..
    //    super(l,w,h);
    }

}
