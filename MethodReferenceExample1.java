//Static Method Reference

import java.util.Arrays;

public class MethodReferenceExample1 {
    public static void main(String[] args) {
        // Using lambda expression
        Arrays.asList("apple", "banana", "orange")
              .forEach(s -> System.out.println(s));

        // Using static method reference
        Arrays.asList("apple", "banana", "orange")
              .forEach(System.out::println);
    }
}
