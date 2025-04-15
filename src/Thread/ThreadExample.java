package Thread;

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Sum worker1 = new Sum("Thread-1");
        Sum worker2 = new Sum("Thread-2");
        Sum worker3 = new Sum("Thread-3");

        Thread t1 = new Thread(worker1);
        Thread t2 = new Thread(worker2);
        Thread t3 = new Thread(worker3);

        t1.start();
        t1.join(); // chờ t1 xong rồi mới cho t2 chạy

        t2.start();
//      t2.join(); //  bỏ comment nếu muốn t3 chờ t2 xong

        t3.start();
    }
}
/*
Runnable được dùng thay vì kế thừa Thread → dễ tái sử dụng hơn.

join() đảm bảo thứ tự nếu cần (t1 chạy xong mới chạy t2).

Có thể thử bỏ join() để thấy các thread chạy cùng lúc.*/
