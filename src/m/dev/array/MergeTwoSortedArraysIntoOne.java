package m.dev.array;
import java.util.Arrays;
public class MergeTwoSortedArraysIntoOne {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};
        int[] mergedArray = mergeSortedArrays(array1, array2);
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }
    private static int[] mergeSortedArrays(int[] array1, int[] array2) {
        int n1 = array1.length;
        int n2 = array2.length;
        int[] merged = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        // Merge the two arrays
        while (i < n1 && j < n2) {
            if (array1[i] <= array2[j]) {
                merged[k++] = array1[i++]; // Add element from array1
            } else {
                merged[k++] = array2[j++]; // Add element from array2
            }
        }
// If there are remaining elements in array1
        while (i < n1) {
            merged[k++] = array1[i++];
        }
        // If there are remaining elements in array2
        while (j < n2) {
            merged[k++] = array2[j++];
        }
        return merged;
    }
}
