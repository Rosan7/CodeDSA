package com.company.intro;

import java.util.ArrayList;

public class numbergreater {
    public static void main(String[] args) {

        String str = "47";
        int input = 47;
        int n = 2;
        System.out.println(findgreater(str,n,input,""));


    }
    static Integer findgreater(String str,int n,int input,String processed){
        if((int)Math.pow(10,n)-1 == input){

            String str1 = "";
            for(int i=0;i<=n;i++){
                str1 = str1 + '4';
            }
            int answer = Integer.parseInt(str1);

            return answer;
        }
        if(processed.length() == str.length()){

            if(Integer.parseInt(processed) > input){

                return Integer.parseInt(processed);
            }
            return (int)Math.pow(10,6);
        }

        return Math.min(findgreater(str,n,input,'4' + processed),findgreater(str,n,input,'7' + processed));



    }

}
