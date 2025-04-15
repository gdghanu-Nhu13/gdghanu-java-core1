package Asyn_Syn;
// No synchronization here → this is asynchronous access
class Counter {
    int count = 0;
    public void increase() {
        count++;
    }
}
public class Asynchronous {
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
/*
start() – Bắt đầu chạy luồng (thread)
Khi gọi thread.start(), Java sẽ tạo ra một luồng mới và chạy run() hoặc đoạn mã đc đưa vào Runnable.

Quan trọng nè: Nó chạy song song với main(), không đợi.*/
/*
join() – Chờ luồng đó chạy xong rồi mới đi tiếp
Khi gọi t.join(), chương trình sẽ dừng lại, chờ t chạy xong mới tiếp tục.

Dùng khi muốn đảm bảo kết quả đúng, hoặc có thứ tự thực hiện rõ ràng.*/
