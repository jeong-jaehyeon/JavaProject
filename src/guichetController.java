import java.lang.reflect.Array;

public class guichetController {
    // 1. 그래프 값을 가져온다.
    // 2. 알고리즘..? 을 이용한다.
    // 3.
    public static void main(String[] args) {
        System.out.println("guichet controller");

        int i, j, min, index = 0, temp;
        int[] num = {1, 6, 2, 4, 5, 3, 7, 8, 10, 9};

        for (i = 0; i < num.length; i++) {
            min = 999;
            for (j = i; j < num.length; j++) {
                if (min > num[j]) {
                    min = num[j];
                    index = j;
                }
            }
            // 스와핑
            temp = num[i];
            num[i] = num[index];
            num[index] = temp;
        }
        for (int a = 0; a < num.length; a++) {
            System.out.printf("%d",num[a]);
        }
    }

}
