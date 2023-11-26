//Constructor Reference

import java.util.function.Function;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

public class MethodReferenceExample4 {
    public static void main(String[] args) {
        // Using lambda expression
        Function<String, Person> personLambda = (name) -> new Person(name);
        Person personUsingLambda = personLambda.apply("John");
        System.out.println(personUsingLambda.name);  // Output: John

        // Using constructor reference with an argument
        Function<String, Person> personReference = Person::new;
        Person personUsingReference = personReference.apply("Jane");
        System.out.println(personUsingReference.name);  // Output: Jane
    }
}
