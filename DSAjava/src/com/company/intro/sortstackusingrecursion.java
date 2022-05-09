package com.company.intro;

import java.util.Stack;

public class sortstackusingrecursion {
    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) {
        stack.push(30);
        stack.push(-5);
        stack.push(18);
        stack.push(14);
        stack.push(-3);
        stacksort();
        System.out.println(stack);
    }
    static void stacksort(){
        if(stack.size()>0){
            int c = stack.peek();
            stack.pop();
            stacksort();
            pushinstack(c);
        }

    }
    static void pushinstack(int c){
        if(stack.size()==0 || stack.peek()<c){
            stack.push(c);
        }
        else{
            int t = stack.peek();
            stack.pop();
            pushinstack(c);
            stack.push(t);

        }

    }
}
