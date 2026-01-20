package m.dev.leetcode.array.easy;

import java.util.Arrays;

public class MoveZerosToLast {
    public static void main(String[] args) {
        int[] nums= {0,1,0,3,12};
        moveZeroes1(nums);
    }

    private static void moveZeros(int[] nums) {
        int insertPosition=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=0) {
                nums[insertPosition]=nums[i];
                insertPosition++;
            }
        }
        while (insertPosition<nums.length) {
            nums[insertPosition++]=0;
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes1(int[] nums) {
        int lastZeroPosition = 0; // This marks the last zero swap position

        // Loop through the array
        for (int current = 0; current < nums.length; current++) {
            if (nums[current] != 0) {
                // Perform the swap
                int temp = nums[lastZeroPosition];
                nums[lastZeroPosition] = nums[current];
                nums[current] = temp;
                lastZeroPosition++;
            }
        }
    }

}
