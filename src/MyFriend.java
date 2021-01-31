class Friend {
    protected String name;
    protected String phone;

    public Friend(String na, String ph) {
        name = na;
        phone = ph;
    }

    public void showInfo() {
        System.out.println("이름은: " + name + " 전화번호는: " + phone);
    }
}

class UnivFriend extends Friend {
    String major; // 전공

    public UnivFriend(String na, String ma, String ph) {
        super(na, ph);
        major = ma;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("전공은: " + major);
    }
}

class ComFriend extends Friend {
    String department; // 부서

    public ComFriend(String na, String de, String ph) {
        super(na, ph);
        department = de;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("부서는: " + department);
    }
}


public class MyFriend {
    public static void main(String[] args) {
        Friend[] friends = new Friend[10];
        int cnt = 0;

        friends[cnt++] = new UnivFriend("정재현", "IT학과", "010-2339-2750");
        friends[cnt++] = new UnivFriend("노노카", "귀여움학과", "010-0000-0000");
        friends[cnt++] = new ComFriend("팀쿡", "애플", "010-1111-1111");
        friends[cnt++] = new ComFriend("일론머스크", "테슬라", "010-2222-2222");

        for (int i = 0; i < cnt; i++) {
            friends[i].showInfo();
            System.out.println();
        }

    }
}
