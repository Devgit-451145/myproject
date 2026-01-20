package m.dev.palindrome;

public class DevPalindrome {
    public static void main(String[] args) {
        String str1 = "adda";
        String str2 = "HelloWorld";
        System.out.println("Is \"" + str1 + "\" a palindrome? " + isPalindrome(str1));
        System.out.println("Is \"" + str2 + "\" a palindrome? " + isPalindrome(str2));

    }

    private static boolean isPalindrome(String str1) {
        String normalizedStr = str1.toLowerCase().replaceAll(" ", "");
        System.out.println(normalizedStr);
        int left=0;
        int right=normalizedStr.length()-1;

        while (left < right) {
            if (normalizedStr.charAt(left)!= normalizedStr.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        //return str1;
        return true;
    }

}
