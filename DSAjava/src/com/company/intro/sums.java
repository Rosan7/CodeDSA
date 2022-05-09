package com.company.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sums {
    public static void main(String[] args) {
        int[] array = {2,7,11,15};
        int target = 9;
        int[] ans = {};

        System.out.println(sum(array,9,ans));
    }
    static ArrayList<Integer> sum(int[] array,int target,int[] answer){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i = 0;
        int j = array.length-1;
        int flag = 0;
        while(i<j & flag!=1){
            if(array[i]+array[j] == target){

                list.add(i);
                list.add(j);
                flag = 1;
            }
            else if(array[i]+array[j] < target){
                i+=1;

            }
            else{
                j-=1;
            }
        }
        return list;
    }

}
