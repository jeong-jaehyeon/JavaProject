public class Accumulator {
    // 실행결과로, sum = 45 와 같은 수준의 출력을 보여야 함.

    static int a;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Accumulator.add(i); // 인자로 전달되는 값을 모두 누적.
        }

        Accumulator.showResult(); // 최종 누적 결과를 추력
    }

    static void add(int num) {
        a += num;
    }

    static void showResult() {
        System.out.println("sum = " + a);
    }
}


/*
class Accumulator {
    static int sum = 0;

    static void add(int n) {
        sum += n;
    }
    static void showResult() {
        System.out.println("sum = " + sum);
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++)
            Accumulator.add(i);     // Àü´ÞµÇ´Â °ªÀ» ¸ðµÎ ´©Àû

        Accumulator.showResult();    // ÃÖÁ¾ ´©Àû °á°ú¸¦ Ãâ·Â
    }
}
*/

