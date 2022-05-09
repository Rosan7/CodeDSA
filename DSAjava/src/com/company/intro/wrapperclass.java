package com.company.intro;

public class wrapperclass {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;
        Integer num = 34;// this is an example of wrapper class
        // because we are creating objects here
        swap(a,b);
        System.out.println(a + " " + b);
        // the values of a and b will not swap as because they are og type final keyword and values don't change in final
//        final int Increase = 2;
//        Increase = 3;
        final A kunal = new A("kunal Khushwaha");
        kunal.name = "Other name";
        // when a non primitive is final, you cannot reassign it
//        kunal = new A("other object");
        A obj = new A("bdbdbd");
        System.out.println(obj);
//        for(int i=0;i<1000000000;i++){
//            obj = new A("Random name");
//        }

        }
    static void swap(int a ,int b){
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
        System.out.println("Object is destroyed");
    }
}
