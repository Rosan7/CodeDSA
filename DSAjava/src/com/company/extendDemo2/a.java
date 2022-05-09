package com.company.extendDemo2;

public interface a {
    //static interface should always have a body because they cannot be inherited or overridden
    // static methods are called via the interface name in case of interfaces
    static void greeting(){
        System.out.println("Static method");
    }
    default void fun(){
        System.out.println("I am in A");
    }
}
