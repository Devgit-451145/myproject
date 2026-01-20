package dev.code.algorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] array={5,3,4,2,1};
        bubbleSort(array);
    }
    private static void bubbleSort(int[] array) {
        for(int i=0;i<array.length-1;i++) {
            for(int j=0;j<array.length-1;j++) {
                if(array[j]>array[j+1]) {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
