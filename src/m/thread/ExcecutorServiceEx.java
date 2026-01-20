package m.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcecutorServiceEx {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Runnable task1= () -> {
            System.out.println("taks1");
        };
        Runnable task2= () -> {
            System.out.println("task2");
        };
        executor.submit(task1);
        executor.submit(task2);
        executor.shutdown();
    }
}
