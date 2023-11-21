/**
 * Functional Interface Requirement:
 *
 * 1. Create a functional interface named MyFunctionalInterface.
 * 2. Declare a single abstract method called myMethod within the MyFunctionalInterface.
 * 3. Add a default method named anotherMethod within the interface.
 *
 * Program Requirement:
 *
 * 1. Create a class named FunctionalInterfaceExample.
 * 2. Inside the FunctionalInterfaceExample class:
 *    - Implement the MyFunctionalInterface using a lambda expression.
 *    - In the lambda expression, print a message indicating that the myMethod is being executed.
 *    - Call the myMethod using the instance of the functional interface.
 *    - Call the anotherMethod using the instance of the functional interface.
 *
 * Optional:
 * - Add comments to explain each section of your code.
 * - Use the @FunctionalInterface annotation for the MyFunctionalInterface.
 */
@FunctionalInterface
interface MyFunctionalInterface {
    // Abstract method (single method)
    void myMethod();

    // This is a default method, and it does not count
    default void anotherMethod() {
        System.out.println("This is a default method.");
    }
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Using a lambda expression to implement the abstract method
        MyFunctionalInterface myFunc = () -> {
            System.out.println("Executing myMethod.");
        };

        // Calling the abstract method through the lambda expression
        myFunc.myMethod();

        // Calling the default method
        myFunc.anotherMethod();
    }
}
