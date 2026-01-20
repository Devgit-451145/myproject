package m.dev.leetcode.array.easy;

import java.util.HashSet;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int nums[]={1,3,4,6};
        int k=firstMissingPositive1(nums);
        System.out.println(k);
    }
    //using hashset
    private static int firstMissingPositive1(int[] nums) {
        HashSet<Integer> hashSet=new HashSet<>();
        for(int n:nums) {
            hashSet.add(n);
        }
        for(int i=1;i<=nums.length+1;i++) {
            if(!hashSet.contains(i)) {
                return i;
            }
        }

        return -1;
    }
    //brute force approch
    private static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        // Starting from 1, check each integer in the array
        for (int i = 1; i <= n + 1; i++) {
            boolean found = false;
            // Check if i is present in the array
            for (int num : nums) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            // If not found, then it's the missing positive
            if (!found) return i;
        }
        return -1; // The function should never reach here
    }
}
