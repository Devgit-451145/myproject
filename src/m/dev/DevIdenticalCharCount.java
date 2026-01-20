package m.dev;

import java.util.Arrays;

public class DevIdenticalCharCount {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        boolean res = haveIdentical(s1, s2);
    }

    private static boolean haveIdentical(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        boolean haha = sort(s1).equals(sort(s2));
        System.out.println(haha);
        return haha;
    }

    private static String sort(String s1) {
        char[] cc = s1.toCharArray();
        Arrays.sort(cc);
        return new String(cc);
    }
}
