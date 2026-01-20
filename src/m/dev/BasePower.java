package m.dev;

import java.util.ArrayList;

public class BasePower {
    public static void main(String[] args) {
        System.out.println(power(2,8));
    }
    private static int power(int base, int exponent) {
        if(exponent<1)
            return 1;
       //int p=power()
       //return base*power(base,exponent-1) ;
        int c=2;
        for(int i=1;i<8;i++) {
            c*=2;
        }
        System.out.println(c);
        return c;
    }
}
