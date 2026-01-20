package com.dev.practice.sevntyfive;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int [] arr={0,1,0,3,12};
        System.out.println(Arrays.toString(solu(arr)));
        System.out.println(Arrays.toString(solu1(arr)));
        System.out.println(Arrays.toString(solu2(arr)));
        System.out.println(Arrays.toString(solu3(arr)));

    }
    //Time Complexity: O(n), as the array is traversed once.
    //Space Complexity: O(1), no additional data structures are used.
    private static int [] solu3(int[] nums) {
        int writePos=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=0) {
                if(i!=writePos) {
                    int tmp=nums[i];
                    nums[i]=nums[writePos];
                    nums[writePos]=tmp;
                }
                writePos++;
            }
        }
        return nums;
    }
    //TC=O(N) SC=O(1)
    private static int [] solu2(int[] arr) {
        int writePos=0;
        for(int i=0;i< arr.length;i++) {
            if(arr[i]!=0) {
                arr[writePos++]=arr[i];
            }
        }
        while(writePos<arr.length) {
            arr[writePos++]=0;
        }
        return arr;
    }

    //without creating a copy of new array
    private static int [] solu1(int[] nums) {
        int size=nums.length;
        if(size==0 || size==1) {
            return new int[]{0};
        }
        int nz=0,z=0;
        while(nz<size) {
            if(nums[nz]!=0) {
                int temp=nums[nz];
                nums[nz]=nums[z];
                nums[z]=temp;
                nz++;
                z++;
            } else {
                nz++;
            }
        }
        return nums;
    }

    //brute force
    private static int [] solu(int[] arr) {
        int [] newArray=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]!=0) {
                newArray[j]=arr[i];
                j++;
            }
        }
        return newArray;
    }
}
