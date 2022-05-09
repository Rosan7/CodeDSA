package com.company.Singleton;

public class notsubclass {
    public static void main(String[] args) {
        subclass obj = new subclass(133,"Roshan");
        // here num is a protected variable so it is unable to access if it's not a subclass of that package
        //int n = obj.num;
    }
}
