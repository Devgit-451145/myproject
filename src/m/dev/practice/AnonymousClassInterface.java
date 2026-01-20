package m.dev.practice;

public class AnonymousClassInterface {
    public static void main(String[] args) {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("running t");
            }
        };
        Thread thread=new Thread(runnable);
        thread.start();
    }
}
