import java.util.HashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class main {
    static HashMap<Double, Double> valueMap = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("개찰구 프로젝트");
        initGraph();
        initGuichetController();
        initGuichet();
    }

    public static void initGraph() {
        double[] xData = Graph.xData;
        double[] yData = Graph.yData;
        for (int i = 0; i < xData.length; i++) {
            System.out.println(xData[i] + "이 시간에 나가는 " + yData[i] + "인구 값" );
        }

        // TODO: chart 그려줄까? 어떤 그래프인지 실행하면 좋을거같은데?
            //실행은 되는데 끝까지 다 돌아야 마지막에 실행되고 있음.
//        Graph.play();

        // TODO: 여기서 x, y 값 하나씩 리턴?
        for (int i = 0; i < xData.length; i++) {
            valueMap.put(xData[i], yData[i]);
        }

        System.out.println(valueMap);
    }

    public static void initGuichetController() {
        // TODO: 인자로 valueMap 값들을 받아줘야 하지 않을까?
        System.out.println("개찰구컨트롤러 설정");
        System.out.println(valueMap);

        System.out.println(valueMap.get(0.0));
    }

    // 이 로직으로 가야할지.
    public static void initGuichet() {
        System.out.println("개찰구 설정");

        BlockingQueue<Message> queue = new ArrayBlockingQueue<Message>(10);
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

    }





    // 이 로직으로 가야할지?
//    public static void initGuichetController2() {
//        System.out.println("개찰구컨트롤러 설정");
//        initGuichet2();
//    }
//
//    public static void initGuichet2() {
//        System.out.println("개찰구 설정");
//    }
}
