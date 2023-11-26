//Instance Method Reference on an Arbitrary Instance of a Particular Type
import java.util.Arrays;
import java.util.List;

class Printer {
    void print(String s) {
        System.out.println(s);
    }
}

public class MethodReferenceExample3 {
    public static void main(String[] args) {
        // Using lambda expression
        List<String> fruits = Arrays.asList("apple", "banana", "orange");
        fruits.forEach(s -> new Printer().print(s));

        // Using instance method reference on an arbitrary instance
        Printer arbitraryPrinter = new Printer();
        fruits.forEach(arbitraryPrinter::print);
    }
}

