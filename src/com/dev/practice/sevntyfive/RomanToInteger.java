package com.dev.practice.sevntyfive;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToIntger("LVIII"));
    }
   //IV ==1<5==-1+5=4
    //VI=5>1==5+1=6
    //time complexity O(N) -using one for loop
    //space complexity O(N) -using map to store the values
    private static int romanToIntger(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int result=map.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--) {
            if(map.get(s.charAt(i))<map.get(s.charAt(i+1))) {
                result=result-map.get(s.charAt(i));
            } else {
                result=result+map.get(s.charAt(i));
            }
        }
        return result;
    }
}
