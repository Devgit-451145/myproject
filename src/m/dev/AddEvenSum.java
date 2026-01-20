package m.dev;

public class AddEvenSum {
    public static void main(String[] args) {
        int[] nums = {1, -2, 3, -4, 5}; // Example array with negative values
        String result = isSumOddOrEven(nums);
        //System.out.println("The sum of the array is " + result + ".");
        //System.out.println(-0%2);
    }

    private static String isSumOddOrEven(int[] nums) {
        int sum = 0;
        // Calculate the sum of the elements
           for (int num : nums) {
            //sum = sum+num;
            if (num % 2 == 0) {
                System.out.println("Even--"+num);
            } else {
                System.out.println("odd--"+num);
            }
        }
        System.out.println(sum);
        return "";
    }
}
