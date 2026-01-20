package m.dev.febonocci;

public class FebonocciWithoutRecursion {
    public static void main(String[] args) {
        System.out.println(febo(5));
    }

    private static int febo(int n) {
        int first = 0;
        int sec = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(" " + first);
            int next = first + sec;
            first = sec;
            sec = next;

        }
        return first;
    }
}


