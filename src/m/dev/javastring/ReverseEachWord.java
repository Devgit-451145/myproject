package m.dev.javastring;

public class ReverseEachWord {
    public static void main(String[] args) {
        String sre="java code";
        //out put avaj edoc
        reverseEachWord(sre);
    }
    private static void reverseEachWord(String str) {
       String [] words=str.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String word:words) {
           for(int i=word.length()-1;i>=0;i--) {
                sb.append(word.charAt(i));
            }
            sb.append(" ");
        }
       System.out.println(sb.toString());
    }
}
