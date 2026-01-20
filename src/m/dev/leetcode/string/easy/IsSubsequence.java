package m.dev.leetcode.string.easy;

public class IsSubsequence {
    public static void main(String[] args) {
        boolean s=isSubSeq("abc","cadbkc");
        System.out.println(s);
    }
    //two pointer
    private static boolean isSubSeq(String s1, String s2) {
        int i = 0,j=0;
        while (i<s1.length() && j<s2.length()) {
            if(s1.charAt(i)==s2.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i==s1.length();
    }
}
