package com.company.oops;

public class oops1 {
    public static void main(String[] args) {
        Student Rosan = new Student(133,"Rosan Sen",88.4f);
        //Student kunal = new Student();

//        Rosan.rno = 133;
//        Rosan.marks = 89.4f;
//        Rosan.name = "Rosan Sen";
//        Student kunal = new Student(13,"kunal",88.5f);
//        Rosan.greeting();
//        kunal.greeting();
//        Rosan.changeName("Roshan Sen");
//        Student Kunal = new Student(13,"Kunal Khushwaha",88.6f);
//        Student Rahul = new Student();
//        System.out.println(Rahul.name);
//        System.out.println(Rahul.marks);
//        System.out.println(Rahul.rno);
          Student a = new Student();
          Student b = a;
        System.out.println(b.name);

//        System.out.println(Rosan.name);
//        System.out.println(Rosan.rno);
//        System.out.println(Rosan.marks);
//        System.out.println(kunal.name);
//        System.out.println(kunal.rno);
//        System.out.println(kunal.marks);
    }
}
class Student{
    int rno;
    String name;
    float marks = 90;
    // this is known as constructor overloading...
    void changeName(String name){
        this.name = name;
    }
    void greeting(){
        System.out.println("Hello my name is " + name);
    }

    Student (Student other){
        this.marks = other.marks;
        this.rno = other.rno;
        this.name = other.name;
    }
//    Student(){
//        this.marks = 89.4f;
//        this.rno = 133;
//        this.name = "Rosan Sen";
//    }
    Student(){
         this(15,"Rousan",78f);
    }
    Student(int roll,String naam,float mark){
//        this.rno = rno;
//        this.marks = marks;
//        this.name = name;
        rno = roll;
        name = naam;
        marks = mark;

    }
}