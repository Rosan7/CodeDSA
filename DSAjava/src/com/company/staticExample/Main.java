package com.company.staticExample;

public class Main {
    public static void main(String[] args) {
//        Humna rosan = new Humna(19,"Rosan Sen",100000,false);
//        Humna kunal = new Humna(22,"Kunal Kush",200000,true);
//
//        //System.out.println(rosan.population);// here population is a static variable of human class
//        //System.out.println(kunal.population);
//        // without using static variable as population the result is 1 in both cases
//        System.out.println(rosan.population);
//        System.out.println(kunal.population);
//        greeting();
        Main funn = new Main();
        funn.fun2();
    }
    // fun is not dependent on objects but greeting is dependent on objects..
    static void fun(){
        //greeting();
        // you cannot access non static stuff withour referencing their instances in a static context.
        // hence here i am referencing it
        Main object = new Main();

        object.greeting(); // you can't use this because it requires an instance
        // and the function you are using does not depend on instances.
    }
    void fun2(){
        greeting();
    }
    // we know that something which is not static, belongs to an object..
    // we can access static variable within instances but when it is static you can't declare instances within it ..
    void greeting(){
    //    fun();
        System.out.println("Hello World");
    }
}
