interface Printable { // 마이크로소프트가 정의하고 제공한 인터페이스
    public void print(String doc);
}

class SamsungPrinterDriver implements Printable2 { // 삼성이 정의한 클래스
    @Override
    public void print(String doc) {
        System.out.println("From 삼성프린터");
        System.out.println(doc);
    }
}

class LGPrinterDriver implements Printable2 { // LG가 정의한 클래스
    @Override
    public void print(String doc) {
        System.out.println("From LG프린터");
        System.out.println(doc);
    }
}

public class PrinterDriver {
    public static void main(String[] args) {
        String myDoc = "main 코드";

        //삼프 출력
        Printable2 prn = new SamsungPrinterDriver2();
        prn.print(myDoc);
        System.out.println("");

        prn = new LGPrinterDriver2();
        prn.print(myDoc);
    }
}
