package com.company.intro;

import java.util.ArrayList;
import java.util.Comparator;

public class permutationseq {
    static ArrayList<String> ans = new ArrayList<>();
    public static void main(String[] args) {
        String s = "";
        for(int i =1;i<=4;i++){
            s = s + (char) (i+'0');
        }
        permuationsinnumbers("",s);
        ans.sort(Comparator.naturalOrder());
        System.out.println(ans);
        System.out.println(ans.get(0));
    }
    static void permuationsinnumbers(String processed,String unprocessed){
        if(unprocessed.length() == 0){
            ans.add(processed);
            return;
        }
        char c = unprocessed.charAt(0);
        for(int i=0;i<=processed.length();i++){
            String f = processed.substring(0,i);
            String g = processed.substring(i,processed.length());
            permuationsinnumbers(f+c+g,unprocessed.substring(1));
        }
    }
}
