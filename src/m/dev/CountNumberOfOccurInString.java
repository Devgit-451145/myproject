package m.dev;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfOccurInString {
    public static void main(String[] args) {
        String text="she sells sea shells by the sea";
        findDev(text);
    }
    private static void findDev(String text) {
        System.out.println(text);
        Map<Character ,Integer> map=new HashMap<>();
        for(char c:text.toCharArray()){
            if(c!=' '){
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue() >= 1){
                System.out.println(entry.getKey()+":"+entry.getValue());
            }

        }

    }
}
