package m.dev.practice;
import java.util.*;
public class Deva {
    public static void main(String[] args) {
        String s1="deven";
        String  s2="evend";
        HashMap<Character,Integer> list=new HashMap<>();
        for(int i=0;i<s1.length();i++) {
            for(int j=0;j<s2.length();j++) {
               if(s1.charAt(i)==s1.charAt(j)) {
                 if(list.containsKey(s1.charAt(i))) {
                     list.put(s1.charAt(i), list.get(s1.charAt(i)-1));
                 } else {
                     list.put(s1.charAt(i),1);
                 }
               }
            }
        }
        //System.out.println(list.keySet().iterator().);
    }
}
