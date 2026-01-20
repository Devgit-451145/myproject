package m.dev.array;

public class FindSecondSmallest {
    public static void main(String[] args) {
        int[] array = {7, 2, 3, 1, 5, 6};
        int secondSmallest = findSecondSmallest(array);
        System.out.println(secondSmallest);
    }
    private static int findSecondSmallest(int[] array) {
        if (array.length < 2) {
            return 0;
        }
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int num : array) {
            if (num < smallest) {
                secondSmallest = smallest; // Update second smallest
                smallest = num;             // Update smallest
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;       // Update second smallest
            }
        }
        return secondSmallest;
    }

}
