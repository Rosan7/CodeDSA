package com.company.abstractDemo;

public class Daughter extends Parent{
    public Daughter(int age){
        super(age);
        this.age = age;
    }

    @Override
    void career() {
        System.out.println(" I want to become coder");
    }

    @Override
    void partner() {
        System.out.println("I love captain america");
    }
}

