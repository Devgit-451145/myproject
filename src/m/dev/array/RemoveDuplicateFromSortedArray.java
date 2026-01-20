package m.dev.array;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int [] nums={1,2,3,3,6,8,8};
        HashSet<Integer> hashSet=new HashSet<>();
        for(int n:nums) {
            hashSet.add(n);
        }
        System.out.println(hashSet);
        int uniqueIndex=1;
         for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
