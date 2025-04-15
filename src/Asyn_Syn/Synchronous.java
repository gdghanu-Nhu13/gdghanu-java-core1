package Asyn_Syn;
class Counter2 {
    int count = 0;

    // Now synchronized → threads will wait their turn
    public synchronized void increase() {
        count++;
    }
}

public class Synchronous {
    public static void main(String[] args) throws InterruptedException{
            Counter c = new Counter();

            Runnable task = () -> {
                for (int i= 0; i< 1000; i++) {
                    c.increase();
                }
            };
            // Run two threads asynchronously
            Thread t1 = new Thread(task);
            Thread t2 = new Thread(task);
            t1.start(); t2.start();
            t1.join(); t2.join();

            System.out.println("the result of count = " + c.count);
        }
}
