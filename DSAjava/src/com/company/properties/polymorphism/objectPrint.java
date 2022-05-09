package com.company.properties.polymorphism;

public class objectPrint {
    int num;
    public objectPrint(int num){
        this.num = num;
    }

    @Override
    public String toString() {
        return "objectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        objectPrint obj = new objectPrint(44);
        // at first the output without overriding would be with a hash value
        System.out.println(obj);
    }
}
