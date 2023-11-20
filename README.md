# java-8-practice
Hands-on practice with Java 8 features and concepts.

# Java 8 Concepts Practice

A repository for practicing Java 8 features and concepts through hands-on coding examples.

## Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/java-8-concepts-practice.git

2. Navigate to the project directory:
   ```bash
   cd java-8-concepts-practice

3. Run the Java program:
   ```bash
   javac <name-of-file>.java
   java <class-name>

Usage: 
Explore this project's various Java 8 features, including lambda expressions, streams, and functional interfaces. Try to understand by changing the different inputs and seeing the results yourself.

Code Examples
  ```bash
  // Example of a lambda expression
  Runnable runnable = () -> System.out.println("Hello, Java 8!");
  
  // Example of stream processing
  List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
  names.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);
  ```

Features

- Lambda Expressions:
  LambdaExpressions.java

- Functional Interfaces:
  FunctionalInterfaces.java

- Streams:
  StreamsExample.java

- Default Methods:
  DefaultMethods.java

- Method References:
  MethodReferences.java

- Optional:
  OptionalExample.java

- New Date and Time API:
  DateTimeExample.java

- CompletableFutures:
  CompletableFuturesExample.java

- Nashorn JavaScript Engine:
  NashornExample.java
  
