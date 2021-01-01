

public class main {
    public static void main(String[] args) {
        System.out.println("개찰구 프로젝트");
        initGraph();
        initGuichet();
        initGuichetController();
    }

    public static void initGraph() {
        double[] xData = Graph.xData;
        double[] yData = Graph.yData;
        for (int i = 0; i < xData.length; i++) {
            System.out.println(xData[i] + "이 시간에 나가는 " + yData[i] + "인구 값" );
        }

        // chart 그려줄까? 어떤 그래프인지 실행하면 좋을거같은데?

        // 여기서 x, y 값 하나씩 리턴?
    }

    // 이 로직으로 가야할지.
    public static void initGuichet() {
        System.out.println("개찰구 설정");
    }

    public static void initGuichetController() {
        System.out.println("개찰구컨트롤러 설정");
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
