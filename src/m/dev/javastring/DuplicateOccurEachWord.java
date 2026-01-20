package m.dev.javastring;

import java.util.HashMap;

public class DuplicateOccurEachWord {
    public static void main(String[] args) {
        String str="i am am learn java java";
        String [] words=str.split(" ");
        HashMap<String,Integer> hashMap=new HashMap<>();
        for(int i=0;i<words.length;i++) {
            System.out.println(words[i]);
            if(!hashMap.isEmpty() && hashMap.containsKey(words[i])) {
                hashMap.put(words[i],hashMap.get(words[i])+1);
            } else {
                hashMap.put(words[i],1);
            }
        }
        System.out.println(hashMap);
    }

    }


