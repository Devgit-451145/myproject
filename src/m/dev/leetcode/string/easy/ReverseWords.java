package m.dev.leetcode.string.easy;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseString(s));
    }

    private static String reverseString(String s) {

        String [] val=s.split(" ");
        int length = val.length;
        for(int i=length-1;i>=0;i--) {
            System.out.print(val[i]+" ");
        }
        return "";
    }
}
