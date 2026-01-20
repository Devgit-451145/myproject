package m.dev.javastring;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstringLength {
    public static void main(String[] args) {
        longest("abbac");
        //bac
        //longest("java");
        //abc
    }
    private static void longest(String str) {
        String longestSubString=null;
        int longestSubStringLength=0;
        Map<Character,Integer> map=new LinkedHashMap<>();
        char [] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++) {
            char ch=arr[i];
            if(!map.containsKey(ch)) {
                map.put(ch,i);
            } else{
                i=map.get(ch);
                map.clear();
            }
            if(map.size()>longestSubStringLength) {
                longestSubStringLength=map.size();
                longestSubString=map.keySet().toString();
            }
        }
        System.out.println(longestSubStringLength);
        System.out.println(longestSubString);
    }
}
