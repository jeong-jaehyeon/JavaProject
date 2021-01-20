import java.util.Scanner;

interface FizzBuzz {
    void print(int from, int to);
}

class ConsoleBasedFizzBuzz implements FizzBuzz {

    @Override
    public void print(int from, int to) {
        for (from = 1; from <= to; from++) {

            if (from % 3 == 0 && from % 5 == 0) {
                System.out.println("Fizz Buzz");
            } else if (from % 3 == 0) {
                System.out.println("Fizz");
            } else if (from % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println("this is i: " + from);
            }

        }

    }
    //인터페이스 구현
}

public class FizzBuzzExercise {
    public static void main(String[] args) {
        // 1부터 max 까지 fizzbuzz 구현
        // max 는 콘솔로부터 전달받음
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        System.out.println("숫자 입력: " + max);

        FizzBuzz fizzBuzz = new ConsoleBasedFizzBuzz();
        fizzBuzz.print(1, max);


    }
}
