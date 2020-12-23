import java.lang.reflect.Array;

public class guichetController {
    // 1. 그래프 값을 가져온다.
    // 2. 알고리즘..? 을 이용한다.
    // 3.
    public static void main(String[] args) {
        System.out.println("guichet controller");

        //선택정렬
//        int i, j, min, index = 0, temp;
//        int[] num = {1, 6, 2, 4, 5, 3, 7, 8, 10, 9};
//
//        for (i = 0; i < num.length; i++) {
//            min = 999;
//            for (j = i; j < num.length; j++) {
//                if (min > num[j]) {
//                    min = num[j];
//                    index = j;
//                }
//            }
//            // 스와핑
//            temp = num[i];
//            num[i] = num[index];
//            num[index] = temp;
//        }
//        for (int a = 0; a < num.length; a++) {
//            System.out.printf("%d",num[a]);
//        }

//        //버블정렬
//        int j, i, temp;
//        int[] num = {1, 6, 2, 4, 5, 3, 7, 8, 10, 9};
//        for (j = 0; j < num.length; j++) { // n번 해줘야 전체 순환.
//            for (i = 0; i < num.length - 1; i++) { //num.length-1 n-1 번 비교
//                if (num[i] > num[i + 1]) { // 앞에 있는 값이 뒤보다 크면
//                    temp = num[i]; // 스와핑
//                    num[i] = num[i + 1];
//                    num[i + 1] = temp;
//
//                }
//            }
//        }
//
//        for (int a = 0; a < num.length; a++) {
//            System.out.printf("%d", num[a]);
//        }


        //삽입정렬
        //기존의 어레이를 유지하면서 추가하는 정렬.
        int [] num = {5, 2, 3, 4, 1};
        int i, j, key;

        for (i = 1; i < num.length; i++) { // 두번째 원소부터
            key = num[i];
            j = i - 1;
            while (j >= 0 && num[j] > key) { //두번째부터 and 숫자비교
                num[j + 1] = num[j]; // 위쪽 key 값에 저장되어있기때문에 바로 적용 가능.
                j--; // 이전 값들을 돌기위해.
            }
            num[j + 1] = key;
        }
        for (int a = 0; a < num.length; a++) {
            System.out.printf("%d ",num[a]);
        }
    }


}
