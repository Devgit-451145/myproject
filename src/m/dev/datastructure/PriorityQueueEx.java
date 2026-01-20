package m.dev.datastructure;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        //FIFO
        //With the highest priorities first before elements with lower priority
        Queue<Double> queue=new PriorityQueue<>();
        queue.offer(3.0);
        queue.offer(2.0);
        queue.offer(4.0);
        queue.offer(1.0);
        //queue.peek();
        while(!queue.isEmpty()) {
            System.out.println(queue.poll()); ///1,2,3,4
        }

        Queue<String> queue1=new PriorityQueue<>();
        queue1.offer("A");
        queue1.offer("D");
        queue1.offer("C");
        queue1.offer("K");
        while(!queue1.isEmpty()) {
            System.out.println(queue1.poll()); ///A,C,D,K
        }
        System.out.println(queue1.peek());

    }
}
