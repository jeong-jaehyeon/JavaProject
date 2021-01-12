class SinivelCap { // 콧물 처치
    void take() {
        System.out.println("콧물 해독");
    }
}

class SneezeCap { // 재채기 처치
    void take() {
        System.out.println("재채기 해독");
    }
}

class SnuffleCap { // 코막힘 처치
    void take() {
        System.out.println("코막힘 해독");
    }
}

class ColdPatient { // 감기 환자
    void takeSinivelCap(SinivelCap cap) {
        cap.take();
    }

    void takeSneezeCap(SneezeCap cap) {
        cap.take();
    }

    void takeSnuffleCap(SnuffleCap cap) {
        cap.take();
    }
}

public class BadEncapsulation {
    public static void main(String[] args) {
        ColdPatient coldPatient = new ColdPatient();
        coldPatient.takeSinivelCap(new SinivelCap());
        coldPatient.takeSneezeCap(new SneezeCap());
        coldPatient.takeSnuffleCap(new SnuffleCap());
    }
}
