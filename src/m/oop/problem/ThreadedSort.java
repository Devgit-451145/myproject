package m.oop.problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreadedSort {
    // List to store the integers after threads complete their sleep
    private static final List<Integer> result = new ArrayList<>();
    public static void main(String[] args) throws InterruptedException {
        // Array of integers to sort
        int[] integers = {3, 1, 5, 4, 2};
        // List to keep track of threads
        List<Thread> threads = new ArrayList<>();
        // Create and start a thread for each integer
        for (int integer : integers) {
            Thread thread = new Thread(new SortTask(integer));
            threads.add(thread);
            thread.start();
        }
        // Wait for all threads to finish
        for (Thread thread : threads) {
            thread.join();
        }
        // Sort the result collection
        Collections.sort(result);
        // Print the sorted result
        System.out.println("Sorted result: " + result);
    }
    // Runnable task that each thread will execute
    static class SortTask implements Runnable {
        private final int integer;
        // Constructor to accept the integer value
        public SortTask(int integer) {
            this.integer = integer;
        }
        @Override
        public void run() {
            try {
                // Sleep for the number of seconds equal to the integer value
                Thread.sleep(integer * 1000); // Convert seconds to milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // After sleeping, add the integer to the result list
            synchronized (result) {
                result.add(integer);
            }
        }
    }
}

