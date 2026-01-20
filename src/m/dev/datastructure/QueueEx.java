package m.dev.datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        //FIFO -linear dat structure
        //add --enqueue,offer()
        //Remove-- dequeue,poll()
        //use case
        //printer queue
        //keyboard buffer
        //
        Queue<String> queue=new LinkedList<>();
        queue.offer("dev0");
        queue.offer("dev1");
        queue.offer("dev2");
        queue.offer("dev3");
        System.out.println(queue.peek()); //dev0
        queue.poll();//remove dev0
        System.out.println(queue);


    }
}
