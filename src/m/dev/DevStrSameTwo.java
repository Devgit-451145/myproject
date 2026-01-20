package m.dev;

import java.util.Arrays;

public class DevStrSameTwo {
    public static void main(String[] args) {
        boolean b=dev("deva","dvea");
    }
    private static boolean dev(String s1, String s2) {
        //System.out.println(sort(s1));
        //System.out.print(sort(s2));
        if(sort(s1).equals(sort(s2))) {
            System.out.println("dev");
        } else {
            System.out.print("dev1");
        }
        return true;
    }

    private static String sort(String s) {
        char [] ss=s.toCharArray();
        Arrays.sort(ss);
        return new String(ss);
    }
}
