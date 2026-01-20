package m.dev.array;

import java.util.HashSet;
import java.util.List;

public class FindMissingNumberHashset {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 2, 8, 4}; // Missing numbers: 5, 6
        List<Integer> missingNumbers = findMissingNumbers(arr);
        System.out.println("The missing numbers are: " + missingNumbers);
    }

    private static List<Integer> findMissingNumbers(int[] arr) {
        HashSet<Integer> hashSet=new HashSet<>();
        for(int val:arr) {
            hashSet.add(val);
        }
        for(int i=1;i<=arr.length;i++) {
            if(!hashSet.contains(i)) {
                System.out.println(i);
            }
        }


        return List.of();
    }
}
