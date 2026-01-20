package m.dev;

import java.util.Arrays;

public class DevStringSort {
    public static void main(String[] args) {
        String s="devend";
        char [] sCharArray=s.toCharArray();
        Arrays.sort(sCharArray);
        String ss=new String(sCharArray);
        System.out.println(ss);
    }
}
