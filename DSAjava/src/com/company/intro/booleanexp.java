package com.company.intro;

import java.util.ArrayList;
import java.util.Stack;

public class booleanexp {
    static ArrayList<Character> booleans = new ArrayList<>();
    public static void main(String[] args) {
        String s = "!(t)";
        char operation = s.charAt(0);

        System.out.println(operationsmain(s));
    }
    static boolean operationsmain(String processed){
        int l = processed.length();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<l;i++){
            char c = processed.charAt(i);
            if(c==','){
                continue;
            }
            if (c == ')') {
                char c1 = st.pop();
                String ret = "";
                while(c1 != '('){
                    ret += c1;
                    ret += ",";
                    c1 = st.pop();
                }
                char op = st.pop();
                c = expression(ret,op,true);
            }

        st.push(c);
        }
        char left = st.pop();
        return left == 't'?true:false;
    }
    static char expression(String processed,Character operation,boolean f) {
        char ret = '1';
        if(operation == '!'){
            if (processed.charAt(0) == 't') {
                ret = 'f';
            }
            else{
                ret = 't';
            }

        }
        else if(operation == '&'){
            String[] S = processed.split(",");
            ret = 'f';
            for(String s : S){
                if(s.equals('t')){
                    ret = 't';
                }
                break;
            }
        }
        else{
            String[] S = processed.split(",");
            ret = 't';
            for(String s: S){
                if(s.equals('f')){
                    ret = 'f';
                }
                break;
            }
        }
        return ret;
    }
}
