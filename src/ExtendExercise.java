// 다음 클래스 각각에 적절한 생성자를 삽입해보자.

class Car { // 기본 연료 자동차
    int gasolineGauge; // 가솔린 잔여량

    public Car(int oil) {
        this.gasolineGauge = oil;
    }
}

class HybridCar extends Car { // 하이브리드 자동차
    int electricGauge; // 전기 배터리 잔여량

    public HybridCar(int oil, int electric) {
        super(oil);
        this.electricGauge = electric;
    }
}

class HybridWaterCar extends HybridCar { // 하이브리드 워터카
    int waterGauge; // 에너지 전환용 물의 잔여량

    public HybridWaterCar(int oil, int electric, int water) {
        super(oil, electric);
        this.waterGauge = water;
    }

    public void showCurrentGauge() {
        System.out.println("잔여 가솔린: " + gasolineGauge);
        System.out.println("잔여 전기량: " + electricGauge);
        System.out.println("잔여 물양: " + waterGauge);
    }
}

public class ExtendExercise {
    public static void main(String[] args) {
        HybridWaterCar hybridWaterCar = new HybridWaterCar(2, 3, 4);
        hybridWaterCar.showCurrentGauge();

        HybridWaterCar hybridWaterCar2 = new HybridWaterCar(1, 2, 3);
        hybridWaterCar2.showCurrentGauge();
    }
}
