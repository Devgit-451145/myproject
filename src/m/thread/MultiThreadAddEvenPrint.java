package m.thread;

class AddEvenThread {
    private int num=1;
    private final int max=10;

    public synchronized void printEven() throws InterruptedException {
      while(num<=max) {
          while (num % 2==0)
              wait();
          System.out.println("even:::"+num);
          num++;
          notify();

      }
    }
    public synchronized void printOdd() throws InterruptedException {
       while(num<=max) {
          while (num % 2==1)
              wait();
          System.out.println("odd:::"+num);
          num++;
          notify();
      }
    }

}
public class MultiThreadAddEvenPrint {
    public static void main(String[] args) {
      AddEvenThread object=new AddEvenThread();
      Thread t1=new Thread(()-> {
          try {
              object.printOdd();
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
      });
      Thread t2=new Thread(()-> {
          try {
              object.printEven();
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
      });
      t1.start();
      t2.start();

    }
}
