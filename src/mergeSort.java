public class mergeSort {
    int[] a = {20, 10, 70, 80, 40, 90};

    public static void main(String[] args) {
        System.out.println("merge sort");
    }

    //서열 정리 - conquer
    public void conquer() {

    }

    //대진표 작성 - divide
    public void divide(int[] a, int low, int high) {

        if (low <  high) {
            int mid = (low +  high) / 2;

            // left 방향
            divide(a, low, mid);

            // right 방향
            divide(a, mid+1, high);

            // fight - 결국 하나와 하나가 남을때 여기로 오게됨.
            conquer();

        } else {
            return;

        }

    }
}
