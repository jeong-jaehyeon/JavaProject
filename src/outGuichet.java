import java.util.concurrent.BlockingQueue;

public class outGuichet implements Runnable {
    private BlockingQueue<Message> queue;

    public outGuichet(BlockingQueue<Message> q) {
        this.queue = q;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Message msg = new Message(i + "번째 사람");

            try {
                Thread.sleep(1000);
                queue.put(msg);
                System.out.println("out 개찰구 들어온" + msg.getMessage());
                queue.take();
                System.out.println("out 개찰구  나간" + i + "번째 사람");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Message msg = new Message("out 개찰구 사용할 사람 없습니다.");
        System.out.println(msg.getMessage());
    }


//    @Override
//    public void run() {
//        // 멀티쓰레드가 아니라면 Producer에서 Exit 가 나왔을 거니까 확인해준다.
//        try {
//            Message msg;
//            while ((msg = queue.take()).getMessage() != "Exit") {
//                Thread.sleep(10);
//                System.out.println("종료된:" + msg.getMessage());
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
}
