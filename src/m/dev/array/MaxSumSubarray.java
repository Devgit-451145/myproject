package m.dev.array;

public class MaxSumSubarray {
    //sliding window logic
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 1, 3, 2}; // Example array
        int k = 3; // Size of the subarray
        int result = maxSumSubarray(nums, k);
        //System.out.println(-1+4);
        System.out.println("Maximum sum of a subarray of size " + k + " is: " + result);
    }
    private static int maxSumSubarray(int[] nums, int k) {
        if(nums.length<k) {
            return 0;
        }
        int sum=0;
        for(int i=0;i<k;i++) {
            sum=sum+nums[i];
        }
        int windowSum = sum;
        //System.out.println(sum);
        for(int i=k;i<nums.length;i++) {
            windowSum = windowSum+nums[i] - nums[i - k]; // Add the next element and remove the first element of the previous window
            sum = Math.max(sum, windowSum);
        }
        System.out.println(sum);
        return k;
    }
}
