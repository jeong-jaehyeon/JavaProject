class MobilePhone {
    protected String number;

    public MobilePhone(String num) {
        number = num;
    }

    public void answer() {
        System.out.println("Hi~ FROM " + number);
    }
}


class SmartPhone extends MobilePhone {
    private String androidVersion;

    public SmartPhone(String num, String ver) {
        super(num);
        androidVersion = ver;
    }

    public void playApp() {
        System.out.println("App is running in" + androidVersion);
    }
}


public class MobileSmartPhoneRef {
    public static void main(String[] args) {
        SmartPhone phone1 = new SmartPhone("010-2339-2750", "Nougat");
        MobilePhone phone2 = new SmartPhone("010-2339-0000", "Nougat");

        phone1.answer();
        phone1.playApp();

        phone2.answer();
        // phone2.playApp(); 불가
    }
}
