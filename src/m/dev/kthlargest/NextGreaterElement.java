package m.dev.kthlargest;
import java.util.Stack;
public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        int[] result = findNextGreaterElements(arr);
        System.out.print("Next greater elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    private static int[] findNextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        // Initialize the result array with -1
        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }
        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // Check for next greater elements
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                result[stack.pop()] = nums[i];
            }
            stack.push(i);
        }
        return result;
    }
}

