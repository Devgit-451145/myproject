package m.dev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        // Sample sorted list with duplicates
        List<Integer> sortedList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 4, 5, 5));
        // Remove duplicates
        List<Integer> uniqueList = removeDuplicates(sortedList);
        // Print the unique list
        System.out.println("List after removing duplicates: " + uniqueList);
    }
    private static List<Integer> removeDuplicates(List<Integer> sortedList) {
        List<Integer> uniqueList = new ArrayList<>();
        for(int i=0;i<sortedList.size()-1;i++){
            if(i==0 || !sortedList.get(i).equals(sortedList.get(i-1))) {
                uniqueList.add(sortedList.get(i));
            }
        }
        return uniqueList;
    }
}
