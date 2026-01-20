package m.dev;

public class Recursion {
    public static void main(String[] args) {
        int r=fast(5);
        System.out.println(r);
    }

    private static int fast(int i) {
        if(i==1) return 1;
        System.out.println(i);
        //fast(i-1);
        //System.out.println(+fast(i-1));

        //return i;
        return i*fast(i-1);
    }
}
