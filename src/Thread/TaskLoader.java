package Thread;

public class TaskLoader implements Runnable {
    private final String taskName;

    public TaskLoader(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(taskName + " đang bắt đầu...");
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " loading... " + (i * 20) + "%");
            try {
                Thread.sleep(500); // giả lập thời gian loading
            } catch (InterruptedException e) {
                System.out.println(taskName + " bị gián đoạn.");
            }
        }
        System.out.println(taskName + " đã hoàn thành! 🎉");
    }
}
