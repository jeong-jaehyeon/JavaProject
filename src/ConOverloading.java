class Person {
    private int regiNum; // 주민등록 번호
    private int passNum; // 여권 번호

    public Person(int rnum, int pnum) {
        regiNum = rnum;
        passNum = pnum;
    }

    public Person(int rnum) {
        regiNum = rnum;
    }

    void showPersonalInfo() {
        System.out.println("주민등록 번호:" + regiNum);

        if (passNum != 0) {
            System.out.println("여권 번호:" + passNum);
        } else {
            System.out.println("여권 번호가 없습니다.");
        }
    }
}


public class ConOverloading {
    public static void main(String[] args) {
        Person jhPerson = new Person(960902, 10000);
        jhPerson.showPersonalInfo();

        Person person = new Person(970902);
        person.showPersonalInfo();

    }
}
