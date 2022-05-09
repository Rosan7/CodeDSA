package com.company.intro;

import java.lang.reflect.Array;
import java.util.*;

public class combinationsofwords {
    ArrayList<String> answers = new ArrayList<>();
    public static void main(String[] args) {
        ArrayList<String> dict = new ArrayList<>();
        ArrayList<String> answers = new ArrayList<>();
        String S = "catsanddog";
        dict.add("cats");
        dict.add("dog");
        dict.add("cat");
        dict.add("and");
        dict.add("sand");
        strings(S,dict,0,"",answers);
        System.out.println(answers);

    }
    private static ArrayList<String> strings(String S, List<String> dict, int start, String processed, ArrayList<String> answers){
        if(start == S.length()){
            ArrayList<String> answer = new ArrayList<>();

            answer.add(processed);
            return answer;
        }
        for(int i=start;i<S.length();i++){
            if(dict.contains(S.substring(start,i+1))){
                processed = processed +  S.substring(start,i+1) + " " ;
                answers.addAll(strings(S,dict,i+1,processed,answers));
                System.out.println(answers);
                processed = processed.substring(0,processed.length()-(i+1-start)-1);

            }
            else{
                continue;
            }

        }
        return answers;
    }
}
