package m.dev.leetcode;

import java.util.HashSet;

public class LongestSubstrinWithoutRepeatChar {
    public static void main(String[] args) {
        int s=longestSubString("abcabcbb");
        System.out.println(s);
    }
    private static int longestSubString(String s) {
        if(s==null && s.length()==0) {
            return 0;
        }
        if(s.length()==1) {
            return 1;
        }
        int left=0;
        int right=0;
        int ans=0;
        HashSet<Character> hashSet=new HashSet();
        while (right<s.length()) {
            char c=s.charAt(right);
            while (hashSet.contains(c)) {
                hashSet.remove(s.charAt(left));
                left++;
            }
            hashSet.add(c);
            ans=Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }
}
