package javaTAsk;
public class Multithreading2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread running using Runnable interface");

        for (int i = 0; i < 5; i++) {
            System.out.println("Thread is running: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        Multithreading2 thread = new Multithreading2();
        Thread thread1 = new Thread(thread);
        thread1.start();
    }
}
