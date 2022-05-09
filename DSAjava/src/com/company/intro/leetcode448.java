package com.company.intro;

import java.util.ArrayList;
import java.util.Arrays;

public class leetcode448 {
    public static void main(String[] args) {
        int[] nums = {7,3,2,4,8,2,3,1};
        int i = 0;
        while(i< nums.length){
            int correct = nums[i] -1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        ArrayList<Integer> answer = new ArrayList<>();
        System.out.println(Arrays.toString(nums));
        for(int j=0;j<nums.length;j++){
            if(nums[j]-1 != j){
                answer.add(j+1);
            }}
        System.out.println(answer);
    }
    static void swap(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
