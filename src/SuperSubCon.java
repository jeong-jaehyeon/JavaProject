class SuperCLS {
    public SuperCLS() {
        System.out.println("SuperCLS()");
    }

    public SuperCLS(int i) {
        System.out.println("SuperCLS(int i)");
    }

    public SuperCLS(int i, int j) {
        System.out.println("SuperCLS(int i, int j)");
    }
}

class SubCLS extends SuperCLS {
    public SubCLS() {
        System.out.println("SubCLS()");
    }

    public SubCLS(int i) {
        super(i); // 상위 클래스의 생성자 지정 및 호출
        System.out.println("SubCLS(int i)");
    }

    public SubCLS(int i, int j) {
        super(i, j); // 상위 클래스의 생성자 지정 및 호출
        System.out.println("SubCLS(int i, int j)");
    }
}


public class SuperSubCon {
    public static void main(String[] args) {
        System.out.println("1. ");
        new SubCLS();
        System.out.println();

        System.out.println("2. ");
        new SubCLS(1);
        System.out.println();

        System.out.println("3. ");
        new SubCLS(1, 2);
        System.out.println();
    }
}
