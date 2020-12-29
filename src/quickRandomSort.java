import java.util.Random;

public class quickRandomSort {
    private static int num; // swap 측정을 위한.

    public static void main(String[] args) {
        System.out.println("QuickRandomSort");

        int[] A = {40, 30, 100, 60, 80, 70, 90, 10, 20, 50, 101, 102, 103, 105};

        System.out.println("before merge:");
        for (int i = 0; i < A.length; i++) {
            System.out.printf("%d", A[i]);
        }
        System.out.println("");

        QuickSort(A, 0, A.length - 1);

        System.out.println("after merge:");
        for (int i = 0; i < A.length; i++) {
            System.out.printf("%d", A[i]);
        }

        System.out.println("\n" + num);
    }

    public static void QuickSort(int[] A, int start, int end) {
        int index;

        if (start < end) {

            index = Partition(A, start, end);
            QuickSort(A, start, index - 1);
            QuickSort(A, index + 1, end);
        }
    }

    public static int Partition(int[] A, int start, int end) {
        Random random = new Random();
        int random2 = random.nextInt(10);
        // 해당 어레이의 start, end 값을 반영한 random 값 / start보다는 크며 end보다는 같거나 작아야함.
        int rng = start + (random2 % (end - start + 1));
        int temp;

        // 랜덤 피벗과 해당 어레이의 end값 swap
        temp = A[rng];
        A[rng] = A[end];
        A[end] = temp;
        num++;

        int pivot = A[end];
        int rose = start; // 장미를 가지고 있는 녀석은 피벗보다 큰 녀석
        int i;

        for (i = start; i < end; i++) {

            if (A[i] <= pivot) {
                // 장미를 가지고 있던 피봇보다 큰 숫자와 현재 피봇보다 작은 인덱스의 숫자와 swap
                temp = A[rose];
                A[rose] = A[i];
                A[i] = temp;
                rose++;
                num++;
            }
        }

        //피봇보다 큰 숫자를 가지고있는 장미 인덱스와 피봇을 swap해서 피봇의 최종 자리를 찾아감.
        temp = A[rose];
        A[rose] = A[end];
        A[end] = temp;
        num++;

        //확정 위치를 가진 피봇의 위치를 리턴.
        return rose;
    }
}
