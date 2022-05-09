package com.company.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(23);
        son.career();
        son.normal();
        Daughter daughter = new Daughter(30);
        // this down statement is also possible
//        Parent daughter = new Daughter(30);
        daughter.career();
        // we cannot create object of an abstract class asking me to implement methods override please
        // we cannot create objects of abstract classes because when you call an abstract class it also inherits the methods of object class and the body of abstarct classes are empty so we cannot inherit them
        Parent.hello();
        //Parent mom = new Parent();
    }

}
