package com.company.interfaces;

public class Main {
    public static void main(String[] args) {
       // Engine car = new Car();
        // inheriting methods depends on the reference and Engine has no access to variable a
        //car.a;
//        car.acc();
//        car.start();
//        car.stop();
//        //car.brake();
//        Media carMedia = new Car();
//        carMedia.stop();
        Nicecar car = new Nicecar();
        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();

    }
}
