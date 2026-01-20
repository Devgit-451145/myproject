package m.dev.javastring;

public class Reverse {
    public static void main(String[] args) {
        String str="hello";
        //app1
        char [] ss=str.toCharArray();
        for(int i=str.length()-1;i>=0;i--) {
            System.out.print(ss[i]);
        }

        //app2
        for(int i=str.length()-1;i>=0;i--) {
            System.out.print(str.charAt(i));
        }
    }
}
