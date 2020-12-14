import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private BlockingQueue<Message> queue;

    public Consumer(BlockingQueue<Message> q) {
        this.queue = q;
    }

    @Override
    public void run() {
        // 멀티쓰레드가 아니라면 Producer에서 Exit 가 나왔을 거니까 확인해준다.
        try {
            Message msg;
            while ((msg = queue.take()).getMessage() != "Exit") {
                Thread.sleep(10);
                System.out.println("종료된:" + msg.getMessage());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
