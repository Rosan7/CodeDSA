package com.company.abstractDemo;

public class Son extends Parent{
    public Son(int age){
        super(age);

        this.age = age;
    }

    @Override
    void normal() {
        super.normal();
    }

    @Override
    void career() {
        System.out.println(" I want to become doctor");
    }

    @Override
    void partner() {
        System.out.println("I love Pepper Potts");
    }
}
