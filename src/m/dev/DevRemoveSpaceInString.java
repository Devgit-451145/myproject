package m.dev;

public class DevRemoveSpaceInString {
    public static void main(String[] args) {
        String s="dev  ddfdf d";
        String ss=removeSpace(s);
        System.out.println(ss);
    }

    private static String removeSpace(String s) {
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<s.length();i++) {
            char cc=s.charAt(i);
           if(cc !=' ') {
               stringBuilder.append(cc);
           }
        }
        return stringBuilder.toString();
    }
}
