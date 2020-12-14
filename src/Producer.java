import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    private BlockingQueue<Message> queue;

    public Producer(BlockingQueue<Message> q) {
        this.queue = q;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            Message msg = new Message(i + "번째");

            try {
                Thread.sleep(i);
                queue.put(msg);
                System.out.println("생성된" + msg.getMessage());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Message msg = new Message("Exit");
        try {
            queue.put(msg);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
