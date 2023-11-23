/**
 * Greeting Interface Requirements:
 *
 * 1. Create an interface named Greeting.
 * 2. Declare an abstract method named sayHello in the Greeting interface.
 * 3. Add a default method named sayDefaultHello in the Greeting interface with an implementation.
 *
 * GreetingImpl Class Requirements:
 *
 * 1. Create a class named GreetingImpl that implements the Greeting interface.
 * 2. Provide an implementation for the sayHello method in the GreetingImpl class.
 * 3. Do not override the sayDefaultHello method in the GreetingImpl class, using the default implementation.
 *
 * DefaultMethodExample Class Requirements:
 *
 * 1. Create a class named DefaultMethodExample.
 * 2. In the main method of DefaultMethodExample:
 *    a. Create an instance of GreetingImpl.
 *    b. Call the overridden sayHello method of the Greeting interface on the GreetingImpl instance.
 *    c. Call the default sayDefaultHello method of the Greeting interface on the GreetingImpl instance.
 *
 * Expected Output:
 *
 * The program should output "Hello!" when calling the overridden sayHello method,
 * and "Default Hello!" when calling the default sayDefaultHello method.
 */
// A simple interface with a default method
interface Greeting {
    // Abstract method
    void sayHello();

    // Default method with an implementation
    default void sayDefaultHello() {
        System.out.println("Default Hello!");
    }
}

// A class implementing the Greeting interface
class GreetingImpl implements Greeting {
    // Implementation of the abstract method
    @Override
    public void sayHello() {
        System.out.println("Hello!");
    }

    // The sayDefaultHello method is not overridden, using the default implementation
}

public class DefaultMethodExample {
    public static void main(String[] args) {
        // Create an instance of GreetingImpl
        GreetingImpl greeting = new GreetingImpl();

        // Call the overridden method
        greeting.sayHello();

        // Call the default method
        greeting.sayDefaultHello();
    }
}
