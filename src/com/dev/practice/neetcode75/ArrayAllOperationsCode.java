package com.dev.practice.neetcode75;

import java.util.Arrays;

public class ArrayAllOperationsCode {
    public static void main(String[] args) {
        int [] arr={1,2,4,5,6};
        System.out.println(Arrays.toString(addElemetAtStartin(arr, 9)));
        System.out.println(Arrays.toString(addElemetAtEnd(arr, 9)));
        System.out.println(Arrays.toString(addElemetAtMiddle(arr, 2,9)));
        System.out.println(Arrays.toString(removeElemetAt(arr, 2)));

    }
    private static int [] removeElemetAt(int[] arr, int position) {
        int [] newArray=new int[arr.length-1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if(i!=position) {
                newArray[j++] = arr[i];
            }
        }
    return newArray;
    }

    private static int[] addElemetAtMiddle(int[] arr, int position,int val) {
        int[] newArray=new int[arr.length+1];
        //int k=0;
        for(int i=0;i<position;i++) {
            newArray[i]=arr[i];
        }
        newArray[position]=val;
        for(int i=position;i<arr.length; i++) {
            newArray[i+1]=arr[i];
        }
        return newArray;
    }

    private static int [] addElemetAtEnd(int[] arr, int val) {
        int [] newArray=new int[arr.length+1];
        for(int i=0;i<arr.length;i++) {
            newArray[i]=arr[i];
        }
        newArray[newArray.length-1]=val;
        return newArray;
    }

    private static int [] addElemetAtStartin(int[] arr, int val) {
        int [] newArray=new int[arr.length+1];
        newArray[0]=val;
        for(int i=0;i<arr.length;i++) {
            newArray[i+1]=arr[i];
        }
       return newArray;
    }
}
