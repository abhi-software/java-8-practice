import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        // Creating an Optional with a non-null value
        Optional<String> nameOptional = Optional.of("John");

        // Using methods on Optional
        if (nameOptional.isPresent()) {
            System.out.println("Name is present: " + nameOptional.get());
        } else {
            System.out.println("Name is absent");
        }

        // Creating an Optional with a potentially null value
        String nullableName = null;
        Optional<String> nullableNameOptional = Optional.ofNullable(nullableName);

        // Using methods on Optional with a potentially null value
        if (nullableNameOptional.isPresent()) {
            System.out.println("Nullable name is present: " + nullableNameOptional.get());
        } else {
            System.out.println("Nullable name is absent");
        }

        // Using orElse to provide a default value if the Optional is empty
        String defaultName = nullableNameOptional.orElse("Default");
        System.out.println("Using orElse: " + defaultName);

        // Using map to transform the value inside the Optional
        String uppercasedName = nameOptional.map(String::toUpperCase).orElse("No name");
        System.out.println("Uppercased name: " + uppercasedName);
    }
}
