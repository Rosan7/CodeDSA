package com.company.intro;

import java.util.Stack;

// do it again 7 march 2022
public class basiccalculator {

    static Stack<Integer> values = new Stack<>();

    public static void main(String[] args) {
        System.out.println(calculate("1 + 2 - 1"));

    }
    static int calculate(String S){
        int hero = 1;
        int sum = 0;
        for(int i=0;i<S.length();i++){
            char c = S.charAt(i);
            if(c==' '){
                continue;
            }
            else if(Character.isDigit(c)){
                long n = 0;
                while(i<S.length() && S.charAt(i) >= '0' && S.charAt(i) <= '9'){
                    n = n*10;
                    n = n+(int) (S.charAt(i)-'0');
                    i++;
                }
                n*=hero;
                sum += n;
                hero = 1;
                i--;
            }
            else if (c == '-'){
                hero = -1;
            }
            else if (c == '('){
                values.push(sum);
                values.push(hero);
                sum = 0;
                hero = 1;
            }
            else if (c == ')'){
                sum *= values.pop();
                sum += values.pop();
            }

        }
        return sum;

}}
