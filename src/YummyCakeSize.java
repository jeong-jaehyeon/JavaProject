class Cake2 {
    public int size; // cake size

    public Cake2(int sz) {
        size = sz;
    }

    public void showCakeSize() {
        System.out.println("케잌의 크기는? :" + size);
    }
}

class CheeseCake2 extends Cake2 {
    public int size; // cheeseCake size

    public CheeseCake2(int sz1, int sz2) {
        super(sz1);
        size = sz2;
    }

    public void showCakeSize() {
        System.out.println("케잌의 크기는? :" + super.size);
        System.out.println();
        System.out.println("치즈 케잌의 크기는? :" + size);
    }
}


public class YummyCakeSize {
    public static void main(String[] args) {
        CheeseCake2 cheeseCake = new CheeseCake2(5, 7);
        Cake2 cake2 = cheeseCake; // 치즈케이크가 참조하는 것을 cake2도 참조함.

        System.out.println("케잌의 사이즈는? :" + cake2.size);
        System.out.println();
        System.out.println("치즈 케잌의 사이즈는? :" + cheeseCake.size);
        System.out.println();

        System.out.println("치즈 케이크 쇼케이크");
        cheeseCake.showCakeSize();
        System.out.println("케이크 쇼케이크");
        System.out.println();
        cake2.showCakeSize();
    }
}
