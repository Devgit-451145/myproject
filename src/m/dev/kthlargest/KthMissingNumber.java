package m.dev.kthlargest;

public class KthMissingNumber {
    public static void main(String[] args) {
        int [] arr={2,3,4,7,11};
        int k=5;
        System.out.println(findKthMissing(arr, k));
    }
    private static int findKthMissing(int[] arr, int k) {
        int missingCount = 0;
        int currentPositive = 1;
        int index = 0;
        while (true) {
            if (index < arr.length && arr[index] == currentPositive) {
                index++;
            } else {
                missingCount++;
                if (missingCount == k) {
                    return currentPositive;
                }
            }
            currentPositive++;
        }
    }
}
