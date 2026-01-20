package m.dev.javastring;

import java.util.Arrays;

public class StringPermutationOfOther {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean isPermutation = arePermutations(str1, str2);
        System.out.println(isPermutation);
    }
    private static boolean arePermutations(String str1, String str2) {
        if(str1.length()!=str2.length()) {
            return false;
        }
        // Sort both strings approach 1
        char[] sortedStr1 = str1.toCharArray();
        char[] sortedStr2 = str2.toCharArray();
        Arrays.sort(sortedStr1);
        Arrays.sort(sortedStr2);
        // Compare sorted strings
        //return Arrays.equals(sortedStr1, sortedStr2);
        //approach 2
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<sortedStr1.length;i++) {
            for(int j=0;j<sortedStr2.length;j++) {
                if(sortedStr1[i]==sortedStr2[j]) {
                    stringBuilder.append(sortedStr1[i]);
                    System.out.println(sortedStr1[i]+"--"+sortedStr2[j]);
                }
            }
        }
        System.out.println(sortedStr1.length);
        System.out.println(stringBuilder.length());
        if(stringBuilder.length()==sortedStr1.length) {
            return true;
        }
        //
        return false;
    }
}