package m.dev.array;

import java.util.Arrays;

public class SortArrayDescending {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 4, 2};
         Arrays.sort(arr);
         for(int j=arr.length-1;j>=0;j--) {
            System.out.print(arr[j]+" -> ");
         }
        // Reverse the array
        System.out.println(arr.length/2);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        // Print the sorted array
        System.out.print("Sorted array in descending order: ");
        System.out.println(Arrays.toString(arr));
    }
}
