package m.dev.array;

public class PrintSubArray {
    public static void main(String[] args) {
        int [] s={1,2,3,4,5};
        printSubArray(s);
    }
    private static void printSubArray(int[] s) {
        for(int i=0;i<s.length;i++) {
            for(int j=i; j<s.length;j++) {
                for(int k=i;k<=j;k++) {
                    System.out.print(s[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
