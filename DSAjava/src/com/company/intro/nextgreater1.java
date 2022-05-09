package com.company.intro;

import java.util.HashMap;
import java.util.Stack;

public class nextgreater1 {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,8,7,6,5,10};
        HashMap<Integer,Integer> ans = new HashMap<>();
        Stack<Integer> value = new Stack<>();
        for(int num : nums2){
            while(!value.isEmpty() && value.peek()< num){
                ans.put(value.peek(),num);
                value.pop();
            }
            value.push(num);
        }
//        while(!value.isEmpty()){
//            ans.put(value.peek(),-1);
//            value.pop();
//        }
        System.out.println(value);
        System.out.println(ans);

    }
}
