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
        IntStream.rangeClosed(0, 100).mapToObj(
                        i -> i % 3 == 0 ?
                                (i % 5 == 0 ? "FizzBuzz" : "Fizz") :
                                (i % 5 == 0 ? "Buzz" : i))
                .forEach(System.out::println);
    }
}
