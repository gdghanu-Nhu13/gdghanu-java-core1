package Thread;

public class GamingExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new TaskLoader("loading energy system"));
        Thread t2 = new Thread(new TaskLoader("initializing AI core"));
        Thread t3 = new Thread(new TaskLoader("loading graphic assets"));

        t1.start();
        t2.start();
        t3.start();
    }
}
