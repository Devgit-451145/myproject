package m.dev.permutation;

public class PermutationString {
    public static void main(String[] args) {
        System.out.println(perm("edvendar",""));
    }
    private static String perm(String str, String prefix) {
        if(str.length()==0) {
            return "";
        } else {
            for(int i=0;i< str.length();i++) {
                String rem=str.substring(0,i)+str.substring(i+1);
                System.out.println(rem);
                perm(rem,prefix+str.charAt(i));
            }
        }
        return str;
    }
}
