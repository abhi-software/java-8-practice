//Instance Method Reference on a Particular Instance

import java.util.List;
import java.util.Arrays;

class Printer {
    void print(String s) {
        System.out.println(s);
    }
}

public class MethodReferenceExample2 {
    public static void main(String[] args) {
        // Using lambda expression
        List<String> fruits = Arrays.asList("apple", "banana", "orange");
        fruits.forEach(s -> new Printer().print(s));

        // Using instance method reference on a particular instance
        Printer printer = new Printer();
        fruits.forEach(printer::print);
    }
}
