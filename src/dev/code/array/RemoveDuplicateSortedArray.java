package dev.code.array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateSortedArray {
    public static void main(String[] args) {
        int[] array={0,0,1,1,2,2,3,3,4};
       int length= removeDuplicates(array);
       for(int i=0;i<length;i++) {
           System.out.print(array[i] +" ");
       }
    }
    private static int removeDuplicates(int[] array) {
        if(array.length==0) return 0;
        int k=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=array[k]) {
                k++;
                array[k] = array[i];
            }
        }
        return k+1;
    }

}
