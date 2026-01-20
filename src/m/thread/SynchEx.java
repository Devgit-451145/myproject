package m.thread;

public class SynchEx {
    public static void main(String[] args) {
        Counter counter=new Counter();

        Thread t1=new Thread(()->{
            for (int i=0;i<5;i++) {
                counter.increment();
                System.out.println("t1");
            }
        });
       Thread t2=new Thread(()->{
           for (int i=0;i<3;i++) {
               counter.increment();
               System.out.println("t2");
           }
       });
       t1.start();
       t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("final count"+counter.getCount());
    }
}
class Counter {
    private int count=0;
    public synchronized void increment ()
    {
        count++;
    }
    public int getCount() {
        return count;
    }
}