package Thread;

 class Sum implements Runnable{
     private final String threadName;

     public Sum(String threadName) {
         this.threadName = threadName;
     }
     @Override
     public void run() {
         System.out.println(threadName + " bắt đầu tính tổng...");
         int sum = 0;
         for (int i = 1; i <= 5; i++) {
             sum += i;
             try {
                 Thread.sleep(300); // giả lập xử lý chậm
             } catch (InterruptedException e) {
                 System.out.println(threadName + " bị gián đoạn");
             }
         }
         System.out.println(threadName + " đã xong. Tổng = " + sum);
     }
}
