package m.dev.javastring;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatedCharInString {
    public static void main(String[] args) {
        findVal("AABCCDDBEF");
    }
    private static void findVal(String str) {
        //approach 1
        for(int i=0;i<str.length();i++) {
            boolean unique=true;
            for(int j=0;j<str.length();j++) {
                if(i!=j && str.charAt(i)==str.charAt(j)) {
                    unique=false;
                    break;
                }
            }
            if(unique) {
                System.out.println(str.charAt(i));
                break;
            }
        }
        //APPROACH 2
        Map<Character,Integer>  map=new HashMap<>();
        for(char c:str.toCharArray()) {
            if(map.containsKey(c)) {
                map.put(c,map.get(c)+1);
            } else {
                map.put(c, 1);
            }
        }
       for(Map.Entry<Character,Integer> entrySet:map.entrySet()) {
           if(entrySet.getValue()==1) {
               System.out.println(entrySet.getKey());
               break;
           }
       }
    }
}
