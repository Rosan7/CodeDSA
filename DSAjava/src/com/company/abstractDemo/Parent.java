package com.company.abstractDemo;

public abstract class Parent {
    // we cannot have a final abstarct class because final disallows it form getting inherited
    int age;
    final int VALUE;
    // constuctor of an abstract class
    public Parent(int age){
        this.age = age;
        VALUE = 324555;
    }
    // abstract constructors cannot be created
    //abstract Parent();
    static void hello(){
        System.out.println("hey there");
    }
    void normal(){
        System.out.println("this is a normal method");
    }
    abstract void career();
    abstract void partner();
}
