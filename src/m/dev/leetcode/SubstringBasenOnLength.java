package m.dev.leetcode;

public class SubstringBasenOnLength {
    public static void main(String[] args) {
        String ss=inputF("helloworld",4); //10
    }

    private static String inputF(String str, int len) {
        //10<3
        if(len==0 || str.length()<len) {
            return "invalid string";
        }
        for(int i=0;i<str.length()-len;i++) {
            String subStrings=str.substring(i,i+len);
            System.out.println(subStrings);
        }


        return str;
    }
}
