package com.dev.practice.sevntyfive;

public class RotateArray {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5};
        //solution(nums);
        for(int i=0;i<nums.length;i++) {
            //System.out.print(nums[i] + " ");
        }

        rotate(nums,4);
        for(int i=0;i<nums.length;i++) {
            System.out.print(nums[i]+ " ");
        }
    }

    private static void solution1(int[] a) {
        int temp=a[0];
        for(int i=1;i<a.length;i++) {
            a[i-1]=a[i];
        }
        a[a.length-1]=temp;
    }
    static void reverse(int [] a,int start,int end) {
        while (start<end) {
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
    static void rotate(int [] a,int k) {
        k=k%a.length;
        if(k<0) {
            k=k+a.length;
        }
        for(int i=0;i<k;i++) {
            //solution1(a);
        }
        //optimal
        reverse(a,0,k-1);
        reverse(a,k,a.length-1);
        reverse(a,0,a.length-1);
    }

    private static void solution(int[] nums) {
        int temp=nums[0];
        for(int i=1;i<nums.length;i++) {
            nums[i-1]=nums[i];
        }
        nums[nums.length-1] =temp;
    }
}
