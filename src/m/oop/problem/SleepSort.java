package m.oop.problem;

import java.util.*;

public class SleepSort {
    // A method to implement sleep sort
    public static void sleepSort(int[] arr) {
        List<Thread> threads = new ArrayList<>();
        // Create a thread for each number in the array
        for (int num : arr) {
            Thread t = new Thread(() -> {
                try {
                    // Sleep for 'num' milliseconds
                    Thread.sleep(num);
                    // Print the number after sleeping
                    System.out.print(num + " ");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            threads.add(t);
            t.start();  // Start the thread
        }
        // Wait for all threads to finish
        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        // Example input array
        int[] arr = {4, 3, 1, 9, 2, 5};
        System.out.println("Sorting the array using Sleep Sort...");
        sleepSort(arr);
    }
}