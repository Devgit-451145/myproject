package m.dev;

public class DevStringReplace {
    public static void main(String[] args) {
        String ss="hi  how are  you ";
        String sss=ss.replaceAll(" ","%20");
        System.out.println(sss);
    }
}
