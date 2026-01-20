package m.dev;

public class DebFebonacci {
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<n;i++) {
            System.out.print(feb(i)+" ");
        }
        System.out.println(n);
    }
    private static int feb(int n) {
      if(n<=1)
          return n;
      return feb(n-1)+feb(n-2);
    }
}
