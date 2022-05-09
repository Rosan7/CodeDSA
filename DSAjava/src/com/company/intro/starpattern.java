package com.company.intro;

public class starpattern {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for (int t = 0;t<=i;t++){
                System.out.print(" ");
            }
            for( int s = 1;s<=5-i;s++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
