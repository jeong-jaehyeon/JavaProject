class SinusCap {
    void SinivelCap() { // 콧물 처치
        System.out.println("콧물 해독");
    }

    void SneezeCap() { // 재채기 처치
        System.out.println("재채기 해독");
    }

    void SnuffleCap() { // 코막힘 처치
        System.out.println("코막힘 해독");
    }

    void take() {
        SinivelCap();
        SneezeCap();
        SnuffleCap();
    }
}


class ColdPatient2 { // 감기 환자
    void takeSinus(SinusCap cap) {
        cap.take();
    }
}

public class OneClassEncapsulation {
    public static void main(String[] args) {
        ColdPatient2 coldPatient = new ColdPatient2();
        coldPatient.takeSinus(new SinusCap());
    }
}
