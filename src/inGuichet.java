import java.util.concurrent.BlockingQueue;

public class inGuichet implements Runnable {

    private BlockingQueue<Message> queue;

    public inGuichet(BlockingQueue<Message> q) {
        this.queue = q;
    }


    // 이건 멀티쓰레드를 위한 예제이지만 나는 지금 개찰구 컨트롤을 위한 예제를 짜야한다.
    // in out 하나씩 짜본다고 가정하면,
    // run에서의 Exit 를 뱉는 쪽은 필요없고, for문에서의 사이즈는 그래프에서 받아온 값을 알고리즘에 맞게 배분후 in 과 out에 뿌려주면 될듯하다.
    // 우선 지금은 20, 10 으로 하겠다. 사람이 개찰구를 지나가는 속도는 1초

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            Message msg = new Message(i + "번째 사람");

            try {
                Thread.sleep(1000);
                queue.put(msg);
                System.out.println("in 개찰구 들어간" + msg.getMessage());
                queue.take();
                System.out.println("in 개찰구 나간" + i + "번째 사람");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Message msg = new Message("in 개찰구 사용할 사람 없습니다.");
        System.out.println(msg.getMessage());
    }

//    @Override
//    public void run() {
//        for (int i = 0; i < 30; i++) {
//            Message msg = new Message(i + "사람");
//
//            try {
//                Thread.sleep(i);
//                queue.put(msg);
//                System.out.println("생성된" + msg.getMessage());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//        Message msg = new Message("Exit");
//        try {
//            queue.put(msg);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
}
