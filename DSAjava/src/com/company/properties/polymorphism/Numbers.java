package com.company.properties.polymorphism;

public class Numbers {
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    // this methods will also work because the order of the type is different
//    void sum(int a ,String b){
//    }
//    void sum(String b,int a){
//    }
}
