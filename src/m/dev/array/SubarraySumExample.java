package m.dev.array;

public class SubarraySumExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int start = 2; // Starting index (inclusive)
        int end = 5;   // Ending index (inclusive)
        int subarraySum = sumOfSubarray(array, start, end);
        System.out.println("Sum of elements from index " + start + " to " + end + " is: " + subarraySum);
    }

    private static int sumOfSubarray(int[] array, int start, int end) {
        int sum=0;
        for(int i=0;i<array.length;i++) {
            if(i>=2 && i<=5) {
                sum=sum+array[i];
            }
        }
        return sum;
    }
}
