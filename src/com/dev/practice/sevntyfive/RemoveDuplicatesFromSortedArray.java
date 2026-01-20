package com.dev.practice.sevntyfive;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int [] nums={2,2,3,3,4,6,6};
        int index=solution(nums);
        //System.out.println(solution(nums));
        for(int i=0;i<index;i++){
            System.out.print(nums[i]+ " ");
        }

    }
    private static int solution(int[] nums) {
        int index=0;
        for(int i=1;i<nums.length;i++) {
            if(nums[index]!=nums[i]) {
                index++;
                nums[index]=nums[i];
            }
        }
        return index+1;
     }
}
