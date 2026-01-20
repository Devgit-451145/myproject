package com.dev.practice.neetcode75;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String [] strs = {"act","pots","tops","cat","stop","hat"};
        System.out.println(solution(strs));
    }
    private static List<List<String>> solution(String[] strs) {

        Map<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++) {
            String s=strs[i];
            char [] c=s.toCharArray();
            Arrays.sort(c);
            String key=String.valueOf(c);
            /*if(!map.containsKey(key)) {
                map.put(key,new ArrayList<>());
            }*/
            map.putIfAbsent(key, new ArrayList<>());
            //map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
            map.get(key).add(s);
        }
        System.out.println(map);
        return new ArrayList<>(map.values());
    }
}
