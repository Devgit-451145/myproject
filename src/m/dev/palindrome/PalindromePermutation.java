package m.dev.palindrome;
import java.util.HashMap;
public class PalindromePermutation {
    public static void main(String[] args) {
        String input = "tact coa"; // Input string
        boolean result = canFormPalindrome(input);
        System.out.println(result);
    }
    private static boolean canFormPalindrome(String str) {
        HashMap<Character,Integer> charCountMap=new HashMap<>();
        str=str.replaceAll(" ","");
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        int oddCount = 0;
        // Check the number of characters with odd counts
        for (int count : charCountMap.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
            // More than one character with an odd count means it cannot form a palindrome
            if (oddCount > 1) {
                return false;
            }
        }
        return true;
    }
}
