package m.dev;

import java.util.Arrays;

public class CharIdenticalCountASci {
    public static void main(String[] args) {
        boolean b=perm("hello","llohe");
        System.out.println(b);
    }
    private static boolean perm(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        char [] k=s1.toCharArray();
        char [] k1=s2.toCharArray();

        Arrays.sort(k);
        Arrays.sort(k1);
        System.out.println(Arrays.equals(k,k1));



        int [] letters=new int[128];
        for(int i=0;i<s1.length();i++){
            letters[s1.charAt(i)]++;
        }

        for(int i=0;i<s2.length();i++){
            letters[s2.charAt(i)]--;
            if(letters[s2.charAt(i)]<0){
                return false;
            }

        }

        return true;
    }
}
