class Cake {
    public void yummy() {
        System.out.println("야미야미~");
    }

    public void tasty() {
        System.out.println("테이스티~");
    }
}

class CheeseCake extends Cake {
    public void yummy() {
        super.yummy(); // 야미야미~ 호출
        System.out.println("치즈 야미야미~");
    }

    public void tasty() {
        super.tasty(); // 테이스티~ 호출
        System.out.println("치즈 테이스티~");
    }
}


public class YummyCakeSuper {
    public static void main(String[] args) {
        CheeseCake cheeseCake = new CheeseCake();
        cheeseCake.yummy();
        cheeseCake.tasty();

    }
}
