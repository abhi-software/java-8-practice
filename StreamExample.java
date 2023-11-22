/**
 * Stream Example Requirements:
 *
 * 1. Create a list of integers named 'numbers' containing values from 1 to 10.
 * 2. Use Java 8 Streams to perform the following operations on the 'numbers' list:
 *    a. Filter out only the even numbers.
 *    b. Map each even number to its square.
 *    c. Print the squared values using the forEach method.
 *
 * Program Output Expectation:
 *
 * The program should print the squared values of the even numbers in the 'numbers' list.
 * Each squared value should be printed on a new line.
 */
import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        // Creating a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using Streams to perform operations on the list
        // 1. Filter even numbers
        // 2. Map each number to its square
        // 3. Print the squared values
        numbers.stream()
               .filter(n -> n % 2 == 0)
               //.peek(e -> System.out.println("Filtered value: " + e)) //peek() to debug streams
               .map(n -> n * n)
               //.peek(e -> System.out.println("Mapped value: " + e)) //peek() to debug streams
               .forEach(System.out::println);
    }
}
