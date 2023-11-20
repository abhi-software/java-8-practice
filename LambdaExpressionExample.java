// Define a functional interface with a single abstract method
interface MathOperation {
    int operate(int a, int b);
}

public class LambdaExpressionExample {

    public static void main(String[] args) {
        // Using a lambda expression to implement the MathOperation interface
        MathOperation addition = (a, b) -> a + b;

        // Using the lambda expression to perform addition
        int result = operate(10, 5, addition);
        System.out.println("Result of addition: " + result);

        // Using a different lambda expression for subtraction
        MathOperation subtraction = (a, b) -> a - b;

        // Using the lambda expression to perform subtraction
        result = operate(20, 8, subtraction);
        System.out.println("Result of subtraction: " + result);
    }

    // A method that takes two operands and a MathOperation, and performs the operation
    private static int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operate(a, b);
    }
}
