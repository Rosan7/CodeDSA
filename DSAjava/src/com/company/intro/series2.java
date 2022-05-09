package com.company.intro;

public class series2 {
    public static void main(String[] args) {
        double sum = 0.0;
        int n = 10;
        for(int i = 1;i<=10;i++){
            sum += (double) i/(i+1);
        }
        System.out.println(sum);
    }
}
