interface Printable2 { // 마이크로소프트가 정의하고 제공한 인터페이스
    public void print(String doc);
}

interface ColorPrintable extends Printable2 {
    public void colorPrint(String doc);
}

class SamsungPrinterDriver2 implements Printable2 { // 삼성이 정의한 클래스 흑백
    @Override
    public void print(String doc) {
        System.out.println("From 삼성프린터");
        System.out.println(doc);
    }
}

class LGPrinterDriver2 implements Printable2 { // LG가 정의한 클래스 흑백
    @Override
    public void print(String doc) {
        System.out.println("From LG프린터");
        System.out.println(doc);
    }
}

class ColorPrinterDriver2 implements ColorPrintable { // 새롭게 출시한 컬러 프린터!!
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
    public class PrinterDriver2 {
    public static void main(String[] args) {
        String myDoc = "main 코드";

        //삼성 흑백 출력
        Printable2 prn = new SamsungPrinterDriver2();
        prn.print(myDoc);

        //LG 흑백 출력
        prn = new LGPrinterDriver2();
        prn.print(myDoc);

        //샤오미 흑백 + 컬러 출력
        System.out.println("");
        ColorPrinterDriver2 prn2 = new ColorPrinterDriver2();
        prn2.print(myDoc);
        prn2.colorPrint(myDoc);
    }
}
