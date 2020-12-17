import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class InOutGuichetTest {
    public static void main(String[] args) {

        // 사이즈를 30으로
        BlockingQueue<Message> queue = new ArrayBlockingQueue<Message>(30);
        inGuichet inGuichet = new inGuichet(queue);
        inGuichet inGuichet2 = new inGuichet(queue);
        inGuichet inGuichet3 = new inGuichet(queue);
        inGuichet inGuichet4 = new inGuichet(queue);
        inGuichet inGuichet5 = new inGuichet(queue);
        inGuichet inGuichet6 = new inGuichet(queue);
        inGuichet inGuichet7 = new inGuichet(queue);
        inGuichet inGuichet8 = new inGuichet(queue);

        outGuichet outGuichet = new outGuichet(queue);
        outGuichet outGuichet2 = new outGuichet(queue);

        // in 개찰구 큐에 메세지 생산 시작
        new Thread(inGuichet).start();
        new Thread(inGuichet2).start();
        new Thread(inGuichet3).start();
        new Thread(inGuichet4).start();
        new Thread(inGuichet5).start();
        new Thread(inGuichet6).start();
        new Thread(inGuichet7).start();
        new Thread(inGuichet8).start();

        // out 개찰구 큐에 메세지 마무리 시작
        new Thread(outGuichet).start();
        new Thread(outGuichet2).start();

        System.out.println("개찰구 테스트 시작");
    }
}
