public class quickSort {
    public static void main(String[] args) {
        System.out.println("Quick Sort");

        int[] A = {40, 30, 100, 60, 80, 70, 90, 10, 20, 50};
        int i;

        System.out.println("before quick");
        for (i = 0; i < A.length; i++) {
            System.out.printf("%d", A[i]);
        }

        System.out.println("");
        QuickSort(A, 0, A.length - 1);

        System.out.println("after quick");
        for (i = 0; i < A.length; i++) {
            System.out.printf("%d", A[i]);
        }
    }

    public static void QuickSort(int[] A, int start, int end) {
        int index;

        if (start < end) {
            index = Partition(A, start, end); // 누구를 기준으로 줄 세웠는지 인덱스 리턴;
            QuickSort(A, start, index - 1); // 인덱스 중심으로 왼쪽 정렬
            QuickSort(A, index + 1, end); // 인덱스 중심으로 오른쪽 정렬
        } else {
            return;
        }
    }

    public static int Partition(int[] A, int start, int end) {
        int pivot = A[end]; // 기준점
        int index = start; // 기준점보다 낮은 것을 채워넣을 자리
        int i; // 기준점보다 낮은 것이 있나 검사
        int temp; // swap 용

        for (i = start; i < end; i++) {
            if (A[i] <= pivot) { // 기준점(50)보다 작은게 있는지
                temp = A[i]; // swap
                A[i] = A[index];
                A[index] = temp;
                index++; // 인덱스를 통해 자리 지정
            }
        }

        temp = A[index]; // 마지막자리 swap
        A[index] = A[end];
        A[end] = temp;
        return index;
    }
}
