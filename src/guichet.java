import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class guichet {
    public static void main(String[] args) throws InterruptedException {
//        Deque<String> test = new ArrayDeque<String>();
//
//        test.add("add: 0");
//        test.add("add: 1");
//        test.addFirst("First: 2");
//        test.addFirst("First: 3");
//        test.addLast("Last: 4");
//        test.addLast("Last: 5");
//
//        Iterator<String> e = test.iterator();
//        while(e.hasNext()) {
//            System.out.println(e.next());
//        }

        int capacity = 2;
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(capacity);

        queue.put(1);
        queue.put(2);
        System.out.println(queue);

        if (queue.remainingCapacity() == 0) {
            System.out.println("Queue is full");
        } else {
            System.out.println("Queue is not full");
        }

        try {
            //기다리는건 그렇다쳐도 어떻게 그 뒤를 처리한다는거야??
//                System.out.println("catch문 입니다.");
//                for (int i = 1; i < 6; i++) {
//                    Thread.sleep(i * 1000);
//                    System.out.println(i + "초 입니다.");
//                }
//                queue.remove(5);
            long timeout = 3000;
            System.out.println("success: " + queue.offer(1, timeout, TimeUnit.MILLISECONDS));
            System.out.println("success: " + queue.offer(2, timeout, TimeUnit.MILLISECONDS));

            boolean success = queue.offer(3, timeout, TimeUnit.MILLISECONDS);
            queue.remove(2);
            System.out.println("success: " + success);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("추가 실패");
        }

    }

}
