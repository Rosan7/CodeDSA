package com.company.Singleton;

import com.company.access.A;

public class subclass extends A {

    public subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        subclass obj = new subclass(133,"Roshan");
        int n = obj.num;
    }
}
//class subsubclass extends subclass {
//
//    public subsubclass(int num, String name) {
//        super(num, name);
//    }
//
//    public static void main(String[] args) {
//        subclass obj = new subclass(133,"Roshan");
//        int n = obj.num;
//    }
//}