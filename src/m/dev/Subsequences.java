package m.dev;
import java.util.ArrayList;
import java.util.List;

public class Subsequences {
    public static void main(String[] args) {
        String str = "abc";
        List<String> subsequences = new ArrayList<>();
        generateSubsequences(str, "", 0, subsequences);
        System.out.println("All subsequences:");
        for (String subseq : subsequences) {
            System.out.println(subseq);
        }
    }
    private static void generateSubsequences(String str, String current, int index, List<String> result) {
        if (index == str.length()) {
            result.add(current); // Add the current subsequence to the result
            return;
        }
        // Include the current character
        generateSubsequences(str, current + str.charAt(index), index + 1, result);
        // Exclude the current character
        generateSubsequences(str, current, index + 1, result);
    }
}
