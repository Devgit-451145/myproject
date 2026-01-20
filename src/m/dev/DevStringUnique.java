package m.dev;

import java.util.HashSet;

public class DevStringUnique {
    public static void main(String[] args) {
        String s = "abbcd";
        boolean b = isUnique(s);
        System.out.println(b);

    }

    private static boolean isUnique(String s) {
        //System.out.println(s.charAt(0));
        /*HashSet<String> hashSet = new HashSet<>();
        for(int i=0;i<s.length();i++) {

            if(!hashSet.isEmpty() && hashSet.contains(s.charAt(i))) {
                return false;
            }
             hashSet.add(String.valueOf(s.charAt(i)));
        }*/

        char[] content = s.toCharArray();
        HashSet<Character> hashSet = new HashSet<>();

        for (int i = 0; i < content.length - 1; i++) {
            if (!hashSet.isEmpty() && hashSet.contains(content[i])) {
                return false;
            }
            hashSet.add(content[i]);


        }
        return true;
    }
}

