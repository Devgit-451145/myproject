package m.dev.array;

import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {

    public static int[] intersect(int[] nums1, int[] nums2) {
        // Use a HashSet to store the elements of the first array
        Set<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        // Use another HashSet to store the intersection
        Set<Integer> intersection = new HashSet<>();
        for (int num : nums2) {
            if (set.contains(num)) {
                intersection.add(num);
            }
        }
        // Convert the intersection set to an array
        return intersection.stream().mapToInt(i -> i).toArray();
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = intersect(nums1, nums2);
        System.out.print("Intersection: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Output: Intersection: 2
    }
}
