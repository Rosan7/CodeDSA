package com.company.intro;

import java.util.Stack;

public class reverseastack {
    static Stack<Character> st = new Stack<>();

    public static void main(String[] args)
    {

        // push elements into
        // the stack
        st.push('1');
        st.push('2');
        st.push('3');
        st.push('4');

        System.out.println("Original Stack");

        System.out.println(st);

        // function to reverse
        // the stack
        reverse();

        System.out.println("Reversed Stack");

        System.out.println(st);
    }
    static void reverse(){
        if(st.size()>0){
            char c = st.peek();
            st.pop();
            reverse();
            pushinstack(c);
        }
    }
    static void pushinstack(char c){
        if(st.isEmpty()){
            st.push(c);
        }
        else{
            char a = st.peek();
            st.pop();
            pushinstack(c);
            st.push(a);
        }

    }
}
