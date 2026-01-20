package m.dev;

import java.util.Collections;
import java.util.HashMap;

public class CounFirstMaxRepeatedNuber {
    public static void main(String[] args) {
        int [] arr={5,5,2,1,1};
        int k=findRep(arr);
    }

    private static int findRep(int[] arr) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0; i<arr.length;i++){
            if(hashMap.containsKey(arr[i])) {
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
            } else {
                hashMap.put(arr[i],1);
            }

        }
        System.out.println(Collections.max(hashMap.keySet()));
        return 0;
    }
}
