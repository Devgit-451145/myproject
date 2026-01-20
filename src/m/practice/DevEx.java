package m.practice;


import java.util.HashMap;
import java.util.Locale;

public class DevEx {
    public static void main(String[] args) {
        String val="Tact coaof";
        boolean s=isPal(val);
        System.out.println(s);

    }

    private static boolean isPal(String val) {
        val = val.toLowerCase().replaceAll("[^a-z]", ""); // Remove non-alphabet characters

        System.out.println(val);
        HashMap<Character,Integer> hashMap=new HashMap<>();
        char[] s=val.toLowerCase().toCharArray();
        for(char c:s) {
            hashMap.put(c,hashMap.getOrDefault(c,0)+1);
        }
        int oddCnt=0;
        for(int ct:hashMap.values()) {
            if(ct%2!=0) {
                oddCnt++;
            }
            if(oddCnt>1) {
                return false;
            }
        }
        return true;
    }
}
