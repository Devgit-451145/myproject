package m.dev;

import java.util.HashSet;

public class UnicqueCharCheck {
    public static void main(String[] args) {
        String ch = "dev";
        boolean hasChar=checkChr(ch);
        System.out.println(hasChar);
    }
    private static boolean checkChr(String ch) {
        HashSet<Character> hashSet = new HashSet<>();
        for (Character c : ch.toCharArray()) {
            if (!hashSet.add(c)) {
                //return false;
            }
        }
        char[] charArray = ch.toCharArray();
        for(int i=0;i<ch.toCharArray().length-1;i++){
            if(charArray[i]==charArray[i+1]) {
                return false;
            }
        }
        return true;
    }
}
