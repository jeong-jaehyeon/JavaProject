public class mergeSort {



    //서열 정리 - conquer
    public static void conquer(int[] a, int low, int mid, int high) {
        int[] b = new int[10];
        int i = low;
        int j = mid + 1;
        int k = 0;

        // 한쪽이 점멸할때까지
        while (i <= mid && j <= high) { // 다 돌때까지
            if (a[i] <= a[j]) { // 왼쪽
                b[k] = a[i];
                k++;
                i++;
            } else { // 오른쪽
                b[k] = a[j];
                k++;
                j++;

            }
        }

        // 왼쪽이 살아있다면
        while (i <= mid) {
            b[k] = a[i];
            k++;
            i++;
        }

        // 오른쪽이 살아있다면
        while (j <= high) {
            b[k] = a[j];
            k++;
            j++;
        }

        k--; // 빈곳을 보고 있는 k를 하나 줄여줌

        // 문서 작성
        while (k >= 0) {
            a[low+k] = b[k]; // 실제 어레이에 기록
            k--;
        }

    }

    //대진표 작성 - divide
    public static void divide(int[] a, int low, int high) {

        if (low <  high) {
            int mid = (low +  high) / 2;

            // left 방향
            divide(a, low, mid);

            // right 방향
            divide(a, mid+1, high);

            // fight - 결국 하나와 하나가 남을때 여기로 오게됨.
            conquer(a, low, mid, high);

        } else {
            return;

        }

    }

    public static void main(String[] args) {
        System.out.println("merge sort");
        int[] a = {20, 10, 70, 80, 40, 90};
        int i;
        System.out.println("머지 전");
        for (i = 0; i < a.length; i++) {
            System.out.printf("%d", a[i]);
        }

        divide(a, 0, a.length - 1);

        System.out.println("\n머지 후");
        for (i = 0; i < a.length; i++) {
            System.out.printf("%d", a[i]);
        }


    }
}
