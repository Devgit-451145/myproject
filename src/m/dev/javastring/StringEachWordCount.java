package m.dev.javastring;

import java.util.HashMap;
import java.util.Map;

public class StringEachWordCount {
    public static void main(String[] args) {
        count("helllo");
        //output h1,e1,l2,o1
    }
    private static void count(String str) {
        char [] ch=str.toCharArray();
        Map<Character ,Integer> map=new HashMap();
        for(char c:ch){
            if(map.containsKey(c)) {
                map.put(c,map.get(c)+1);
            } else {
                map.put(c,1);
            }
        }
        System.out.println("approach 1:::"+map);
        //approach 2
        str=str.toLowerCase();
        int[] counts=new int[256];
        //count occurrence of each character
        for(char c: str.toCharArray()) {
            counts[c]++;
        }
        //print the result
        for(int i=0;i<counts.length;i++) {
            if(counts[i] >0) {
                System.out.println((char)i+":"+counts[i]);
            }
        }
    }
}
