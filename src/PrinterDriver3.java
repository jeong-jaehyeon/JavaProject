interface Printable3 { // 마이크로소프트가 정의하고 제공한 인터페이스
    public void print(String doc);
    default void colorPrint(String doc) { } // 인터페이스의 디폴트 메소드
}

class SamsungPrinterDriver3 implements Printable3 { // 삼성이 정의한 클래스 흑백
    @Override
    public void print(String doc) {
        System.out.println("From 삼성프린터");
        System.out.println(doc);
    }
}

class ColorPrinterDriver3 implements Printable3 { // 새롭게 출시한 컬러 프린터!!
    @Override
    public void print(String doc) {
        System.out.println("From 샤오미프린터");
        System.out.println(doc + " 흑백출력");
    }

    @Override
    public void colorPrint(String doc) {
        System.out.println("From 샤오미프린터");
        System.out.println(doc + " 컬러출력");
    }
}

public class PrinterDriver3 {
    public static void main(String[] args) {
        String myDoc = "main 코드";

        //삼성 흑백 출력
        Printable3 prn = new SamsungPrinterDriver3();
        prn.print(myDoc);

        //샤오미 흑백 + 컬러 출력
        System.out.println("");
        ColorPrinterDriver3 prn3 = new ColorPrinterDriver3();
        prn3.print(myDoc);
        prn3.colorPrint(myDoc);
    }
}
