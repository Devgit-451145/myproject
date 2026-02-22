package com.dev.practice.neetcode75;

public class ReverseStringOfWords {
    public static void main(String[] args) {
        System.out.println(solu("helllo world dev"));
    }
    private static String solu(String s) {
        String [] val=s.split("\\s+");
        StringBuilder builder=new StringBuilder();
        for(int i=val.length-1;i>=0;i--) {
            builder.append(val[i]);
            if(i!=0) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }
}
