package m.dev.javastring;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        String res=removeDuplicate("PROGRAMMING");
        //System.out.println(res);
    }
    private static String removeDuplicate(String str) {
       //approach 1
       StringBuilder builder=new StringBuilder();
       str.chars().distinct().forEach(c->builder.append((char)c));
        System.out.println(builder);

        //approach 2
        StringBuilder sb2=new StringBuilder();
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            int index=str.indexOf(ch,i+1);
            if(index==-1) {
                sb2.append(ch);
            }
        }
        System.out.println("approach 2---"+ sb2.toString());
        //approach 3
        char[] arr=str.toCharArray();
        StringBuilder sb3=new StringBuilder();
        for(int i=0;i<arr.length;i++) {
            boolean repeated=false;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]==arr[j]) {
                    repeated=true;
                }
            }
            if(!repeated) {
                sb3.append(arr[i]);
            }

        }
        System.out.println("approach3::;;;;"+sb3.toString());

        //approach 4

        StringBuilder sb4=new StringBuilder();
        Set<Character> set=new HashSet<>();
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        System.out.println("hahahhah--"+set);
        for(Character c:set) {
            sb4.append(c);
        }
        System.out.println("approach4::"+sb4.toString());

















        return builder.toString();
    }



}
