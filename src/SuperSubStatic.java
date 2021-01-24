class SuperCLS2 {
    protected static int i = 0;
    public SuperCLS2() {
        i++;
    }
}

class SubCLS2 extends SuperCLS2 {
    public void showCount() {
        System.out.println(i);
    }
}


public class SuperSubStatic {
    public static void main(String[] args) {
        SuperCLS2 superCLS = new SuperCLS2(); // i가 1증가 => 1
        SuperCLS2 superCLS2 = new SuperCLS2(); // i가 1증가 => 2

        // 상속한 상위 클래스가 호출되므로,
        SubCLS2 subCLS = new SubCLS2();

        // 이렇게 했을 때, i는 3이 되어야 정상!
        subCLS.showCount();
    }
}
