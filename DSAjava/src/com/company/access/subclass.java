package com.company.access;

public class subclass extends A{
    public subclass(int num,String name){
        super(num,name);
    }

    public static void main(String[] args) {
        subclass obj = new subclass(45,"Rosan");
        int n = obj.num;
        //System.out.println(obj instanceof A);
        //System.out.println(obj instanceof subclass);
        //System.out.println(obj instanceof Object); true : every instance is an object of subclass
    }
}
