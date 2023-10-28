package Session1;

import java.util.stream.IntStream;

public class FizzBuzz {
    public static void showFizzBuzz(int n) {
        for (int i=0; i<=n;i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " : FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " : Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " : Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void showFizzBuzzStream(int n) {
        IntStream.rangeClosed(1, n)
                .mapToObj(
                        i -> i % 5 == 0 ?
                                (i % 7 == 0 ? "FizzBuzz" : "Fizz") :
                                (i % 7 == 0 ? "Buzz" : i))
                .forEach(System.out::println);
    }
}
