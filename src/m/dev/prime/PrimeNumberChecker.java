package m.dev.prime;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        int number=9;
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        findPrimesUpTo(15);
    }
    private static void findPrimesUpTo(int limit) {
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        //System.out.println(Math.sqrt(number));
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Number is divisible by i
            }
        }
        return true;
    }
}
