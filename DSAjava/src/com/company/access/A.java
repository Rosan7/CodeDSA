package com.company.access;

public class A {
    protected int num = 10;
    String name;
    int[] arr;
    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num = num;
    }
    public A(int num,String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
