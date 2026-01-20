package m.dev.javastring;

import java.util.Arrays;

public class ReplaceCharWithCountInString {
    public static void main(String[] args) {
        rep("OPENTEXTTTTTTTTuyuyuTTTTTT",'T');
        //OUTPUT OPEN1EX2
    }
    private static void rep(String str, char charToReplace) {
        //check the char presence in the string
        if(str.indexOf(charToReplace)==-1) {
            System.out.println("given char is not available in input string");
            System.exit(0);
        }
        //String s="devendar";
        //System.out.println(s.indexOf("x"));
        //char [] arr=str.toCharArray();
        int count=1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==charToReplace) {
                str=str.replaceFirst(String.valueOf(charToReplace), String.valueOf(count));
                count++;
            }
        }
        System.out.println(str);
    }
}
