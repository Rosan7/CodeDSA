package com.company.oops;

public class wrapper {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;
        swap(a,b);
        System.out.println(a + " " + b);
        final A Rosan = new A("Roshan");
        Rosan.name = "kunal";
        // under statement is not possible because non primitive data type is final you cannot reassign it because it is final
        //Rosan = new A("Sourav");
        A obj;
        for(int i=0;i<100000000;i++){
            obj = new A("Kuch bhi");
        }

    }
    // this values are not swapping because of final type
    // final type of variables does not allow us to change its values


    static void swap(Integer a ,Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}
class A{
    final int num = 10;
    String name;
    public A(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}