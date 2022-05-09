package com.company.access;

public class objectdemo {
    int num;
    float gpa;
    public objectdemo(int num,float gpa){
        this.num = num;
        this.gpa = gpa;
    }
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
//        return this.num == ((objectdemo)o).num;
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        objectdemo that = (objectdemo) o;
        return num == that.num && Float.compare(that.gpa, gpa) == 0;
    }

    @Override
    public int hashCode() {
        // return num;
        return super.hashCode();
    }

    public static void main(String[] args) {
        objectdemo obj = new objectdemo(45,76.8f);
        objectdemo obj2 = new objectdemo(18,23.5f);
        // this checks whether the hash value of obj and obj2 are equal or not
        if(obj == obj2){
            System.out.println("objects are equal");
        }
        if(obj.equals(obj2)){
            System.out.println("object equal");
        }
        System.out.println(obj.getClass().getName());
    }
}
