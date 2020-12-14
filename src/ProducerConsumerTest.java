import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerTest {
    public static void main(String[] args) {

        // 사이즈를 30으로
        BlockingQueue<Message> queue = new ArrayBlockingQueue<Message>(30);
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        // 생산자 큐에 메세지 생산 시작
        new Thread(producer).start();

        // 소비자 큐에 메세지 마무리 시작
        new Thread(consumer).start();

        System.out.println("Producer Consumer Test 테스트 시작");
    }
}
