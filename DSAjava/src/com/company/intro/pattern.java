package com.company.intro;

public class pattern {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int t = 1;t<=4-i;t++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            for(int s = i-1;s>=1;s--){
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
