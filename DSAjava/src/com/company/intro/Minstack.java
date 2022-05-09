package com.company.intro;

import java.util.Stack;

public class Minstack {
    class Pair{
        Integer min;
        Integer value;
        Pair(Integer value,Integer min){
            this.value = value;
            this.min = min;
        }
    }
    Stack<Pair> stack;
    public void MinStack() {
        stack = new Stack<Pair>();
    }

    public void push(int val) {
        if(stack.isEmpty()){
            Pair obj = new Pair(val,val);
            stack.push(obj);
        }
        else{
            Pair p = new Pair(val,Math.min(val,stack.peek().min));
            stack.push(p);
        }
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().value;
    }

    public int getMin() {
        return stack.peek().min;
    }
    public static void main(String[] args) {

    }
}
