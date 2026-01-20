package m.thread;

public class ThreadRunnable {
    public static void main(String[] args) throws InterruptedException {
       // MyRunnable runnable=new MyRunnable();
        Thread t=new Thread(new MyRunnable("ping"));
        Thread t1=new Thread(new MyRunnable("pong"));
        t.start();
        t1.start();

        t.join();
        t1.join();
    }
}
class MyRunnable implements Runnable {
    private final String text;
    MyRunnable(String text) {
        this.text=text;
    }
    @Override
    public void run() {
        for(int i=0;i<5;i++) {
            try {
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName()+" "+text);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
       // System.out.println("run");
    }
}