package m.dev;

import java.util.Arrays;

public class DevCheckStringPerm {
    public static void main(String[] args) {
        String s = "dog";
        String s1 = "god";
        boolean b = perm(s, s1);
        System.out.println(b);

    }

    private static boolean perm(String s, String s1) {
        return sort(s).equals(sort(s1));
    }

    private static String sort(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }


}
