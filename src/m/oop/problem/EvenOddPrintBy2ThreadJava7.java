package m.oop.problem;

public class EvenOddPrintBy2ThreadJava7 implements Runnable{
    static int count=1;
    Object object;
    public EvenOddPrintBy2ThreadJava7(Object object){
        this.object=object;
    }
    @Override
    public void run() {
        while(count<=10) {
            while(count % 2 ==0 && Thread.currentThread().getName().equals("even")) {
                synchronized (object) {
                    System.out.println("thread name:"+Thread.currentThread().getName()+" value:"+count);
                    count++;
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            while(count % 2 !=0 && Thread.currentThread().getName().equals("odd")) {
                synchronized (object) {
                    System.out.println("thread name:"+Thread.currentThread().getName()+" value:"+count);
                    count++;
                    object.notify();
                }
            }
        }
    }
    public static void main(String[] args) {
        Object lock=new Object();
        Runnable r1=new EvenOddPrintBy2ThreadJava7(lock);
        Runnable r2=new EvenOddPrintBy2ThreadJava7(lock);
        new Thread(r1,"even").start();
        new Thread(r2,"odd").start();
    }
}
