package m.dev.datastructure;

public class SquareRootBinarySearch {
    public static void main(String[] args) {
        double number = 49.0; // Example number
        double squareRoot = sqrt(number);
        System.out.println("The square root of " + number + " is: " + squareRoot);

    }
    private static double sqrt(double number) {
        if (number < 0) return -1; // Return -1 for negative numbers
        if (number == 0 || number == 1) return number;
        double start = 0, end = number, mid;
        double precision = 0.00001; // Define the precision
        while (end - start > precision) {
            mid = (start + end) / 2;
            if (mid * mid < number) {
                start = mid; // Move to the right half
            } else {
                end = mid; // Move to the left half
            }
        }
        return (start + end) / 2;
    }
}
