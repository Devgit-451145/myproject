package m.oop.problem;

class PrintNumbers {
    private int number = 1; // Start printing from 1
    // Synchronized method to print even numbers
    public synchronized void printEven() {
        while (number <= 20) {
            // Wait until it's the turn of the even thread
            while (number % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            // Print the even number and increment
            System.out.println("Even: " + number);
            number++;
            // Notify the odd thread
            notify();
        }
    }
    // Synchronized method to print odd numbers
    public synchronized void printOdd() {
        while (number <= 20) {
            // Wait until it's the turn of the odd thread
            while (number % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            // Print the odd number and increment
            System.out.println("Odd: " + number);
            number++;
            // Notify the even thread
            notify();
        }
    }
}
// Thread class for printing even numbers
class EvenThread extends Thread {
    private PrintNumbers printNumbers;
    public EvenThread(PrintNumbers printNumbers) {
        this.printNumbers = printNumbers;
    }
    @Override
    public void run() {
        printNumbers.printEven();
    }
}
// Thread class for printing odd numbers
class OddThread extends Thread {
    private PrintNumbers printNumbers;
    public OddThread(PrintNumbers printNumbers) {
        this.printNumbers = printNumbers;
    }
    @Override
    public void run() {
        printNumbers.printOdd();
    }
}
public class EvenOddThreadExample {
    public static void main(String[] args) {
        PrintNumbers printNumbers = new PrintNumbers();
        // Create threads for even and odd numbers
        EvenThread evenThread = new EvenThread(printNumbers);
        OddThread oddThread = new OddThread(printNumbers);
        // Start both threads
        evenThread.start();
        oddThread.start();
    }
}

