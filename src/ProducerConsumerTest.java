import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerTest {
    public static void main(String[] args) {

        // 사이즈를 30으로
        BlockingQueue<Message> queue = new ArrayBlockingQueue<Message>(30);
        inGuichet inGuichet = new inGuichet(queue);
        outGuichet outGuichet = new outGuichet(queue);

        // in 개찰구 큐에 메세지 생산 시작
        new Thread(inGuichet).start();

        // out 개찰구 큐에 메세지 마무리 시작
        new Thread(outGuichet).start();

        System.out.println("개찰구 테스트 시작");
    }
}
