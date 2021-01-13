class Point {
    int xPos, yPos;

    public Point(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public void showPointInfo() {
        System.out.println("[" + xPos + "," + yPos + "]");
    }
}

class Circle2 {
    int rad;
    Point center;

    public Circle2(int xc, int yc, int r) {
        center = new Point(xc, yc);
        rad = r;
    }

    public void showCircleInfo() {
        System.out.println("[" + center.xPos + "," + center.yPos + "," + rad + "]");
        center.showPointInfo();
    }
}

public class CircleCapsulation {
    public static void main(String[] args) {
        Circle2 c = new Circle2(2, 2, 4); // 좌표 2,2 이고 반지름 4 인 원 생성.
        c.showCircleInfo(); // 원의 좌표 정보와 반지름 정보 출력.
    }
}

//
//class Point {
//    int xPos, yPos;
//
//    public Point(int x, int y) {
//        xPos = x;
//        xPos = y;
//    }
//
//    public void showPointInfo() {
//        System.out.println("[" + xPos + ", " + yPos + "]");
//    }
//}
//
//class Circle
//{
//    int rad;	// ¹ÝÁö¸§
//    Point center;    // ¿øÀÇ Áß½É
//
//    public Circle(int x, int y, int r) {
//        center = new Point(x, y);
//        rad = r;
//    }
//
//    public void showCircleInfo() {
//        System.out.println("radius: " + rad);
//        center.showPointInfo();
//    }
//}
//
//class UseCircle {
//    public static void main(String[] args) {
//        // ÁÂÇ¥ [2, 2] ¹ÝÁö¸§ 4ÀÎ ¿øÀÇ »ý¼º
//        Circle c = new Circle(2, 2, 4);
//
//        // ¿øÀÇ Á¤º¸ Ãâ·Â
//        c.showCircleInfo();
//    }
//}

