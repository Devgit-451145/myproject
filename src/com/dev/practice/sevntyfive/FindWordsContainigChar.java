package com.dev.practice.sevntyfive;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainigChar {
    public static void main(String[] args) {
        String[] s={"abc","dhc"};
        char c='c';
        System.out.println(sol(s,c));
    }
    private static List<Integer> sol(String[] s, char c) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<s.length;i++) {
            if(s[i].contains(String.valueOf(c))) {
                list.add(i);
            }
        }
        return list;
    }
}
