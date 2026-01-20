package m.dev.febonocci;

public class FebonocciNthNumber {
    public static void main(String[] args) {
        int n=10;
        System.out.println(feb(n));
    }
    private static int feb(int n) {
    if(n<=1) return n;
    int a=0,b=1,c=0;
    for(int i=2;i<=n;i++) {
        c=a+b;
        a=b;
        b=c;
    }
        //System.out.println(52/27);
    return c;
    }


}
