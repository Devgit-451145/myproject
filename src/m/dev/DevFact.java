package m.dev;

public class DevFact {
    public static void main(String[] args) {
        int s=fact(4);
        System.out.println(s);
    }
    private static int fact(int num) {
        int f=1;

        for(int i=num;i>=1;i--){
            f*=i;
        }

        System.out.println(f);
        if (num==1){
            return 1;
        }
        //return num*fact(num-1);
        return 0;
    }

}
