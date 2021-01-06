public class Triangle {
    // 문제 07-1
    int BaseLine; //밑변
    int Height; //높이

    public Triangle(int num, int bl, int hei) {
        BaseLine = bl;
        Height = hei;
        System.out.println(num + "번 삼각형의 " +"밑변: " + BaseLine + " 높이: " + Height);
    }

    //밑변과 높이 정보 변경 가능 메소드
    public void conditionChange(int baseLine, int height) {
        BaseLine = baseLine;
        Height = height;
    }

    //삼각형 넓이 계산해서 반환하는 메소드
    public int triangleArea() {
        int area= BaseLine * Height / 2;
        System.out.println("넓이는:" + area);
        return area;
    }

    public static void main(String[] args) {
        Triangle first = new Triangle(1, 5, 10);
        Triangle second = new Triangle(2, 10, 20);
        first.triangleArea();
        second.triangleArea();

        first.conditionChange(10, 100);
        second.conditionChange(20, 30);
        first.triangleArea();
        second.triangleArea();

        System.out.println("종료");
    }
}

/*
class Triangle {
    double bottom;
    double height;

    public Triangle(double bt, double hg) {
        bottom = bt;
        height = hg;
    }

    public void setBottom(double bt) {
        bottom = bt;
    }

    public void setHeight(double hg) {
        height = hg;
    }

    public double getArea() {
        return bottom * height / 2;
    }
}

class UseTriangle {
    public static void main(String[] args) {
        Triangle tr = new Triangle(10.2, 17.3);
        System.out.println("»ï°¢ÇüÀÇ ³ÐÀÌ: " + tr.getArea());

        tr.setBottom(7.5);
        tr.setHeight(9.2);
        System.out.println("»ï°¢ÇüÀÇ ³ÐÀÌ: " + tr.getArea());
    }
}
*/
