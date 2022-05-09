package com.company.intro;

public class oops {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];
        // store 5 names
        String[] names = new String[5];
        int[] rno = new int[5];
        Student[] students = new Student[5];
        Student kunal = new Student(13,"kunal op",85.4f);
        Student rahul = new Student();

//        kunal.changeName("DSA teacher");
//        kunal.greeting();

        //kunal.rno = 13;
        //kunal.name = "kunal khushwaha";
        //kunal.marks = 88.5f;

        System.out.println(kunal.marks);
        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        Student random = new Student(kunal);
        System.out.println(random.name);
        Student random2 = new Student();
        System.out.println(random2.name);
        Student one = new Student();
        Student two = one;
        one.name = "Something Something";
        System.out.println(two.name);


        //System.out.println(Arrays.toString(students));
//        System.out.println(kunal.rno);0
//        System.out.println(kunal.name);null
//        System.out.println(kunal.marks);0.0



    }}
    // create class

class Student{
    int rno;
    String name;
    float marks = 90;
    void greeting(){
        System.out.println("Hello! My name is "+ name);
    }
    void changeName(String S){
        name = S;
    }
    Student (Student other){
        this.name = other.name;
        this.marks = other.marks;
        this.name = other.name;
    }
    // constructor overloading

//    Student(){
//        this.rno = 13;
//        this.marks = 88.5f;
//        this.name = "Kunal khushwaha";
//    }
    Student(){
        this(13,"defalut person",100.0f);
    }
    Student(int roll,String naam,float mark){
        rno = roll;
        marks = mark;
        name = naam;
    }

}