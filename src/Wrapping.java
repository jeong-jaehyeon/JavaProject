class Box {
    public void Wrap() {
        System.out.println("Simple Wrapping");
    }
}

class PaperBox extends Box {
    public void Wrap() {
        System.out.println("Paper Wrapping");
    }
}

class GoldPaperBox extends PaperBox {
    public void Wrap() {
        System.out.println("Gold Wrapping");
    }
}


public class Wrapping {
    public static void main(String[] args) {
        Box box1 = new Box();
        PaperBox box2 = new PaperBox();
        GoldPaperBox box3 = new GoldPaperBox();

        wrapBox(box1);
        wrapBox(box2);
        wrapBox(box3);
    }

    public static void wrapBox(Box box) {
        box.Wrap();
    }
}



