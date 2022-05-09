package com.company.intro;

import java.util.ArrayList;

public class Main {
    static ArrayList<String> answers = new ArrayList<>();
    public static void main(String[] args) {
	String tiles = "AAABBC";
    String processed = "";
    ArrayList<Integer> dontouch = new ArrayList<>();
    tilecombine(tiles,processed,dontouch);
    System.out.println(answers.size()-1);
    }
    static void tilecombine(String tiles,String processed,ArrayList<Integer> dontouch){
        if(processed.length() == tiles.length()){
            if(!answers.contains(processed)){
            answers.add(processed);}
            return;
        }
        if(!answers.contains(processed)) {
            answers.add(processed);
        }
        for(int i=0;i<tiles.length();i++){
            if(!dontouch.contains(i)){
                processed = processed + tiles.charAt(i);
                dontouch.add(i);
                tilecombine(tiles,processed,dontouch);
                processed = processed.substring(0,processed.length()-1);
                dontouch.remove(dontouch.size()-1);
            }

        }
        return;
    }
}
