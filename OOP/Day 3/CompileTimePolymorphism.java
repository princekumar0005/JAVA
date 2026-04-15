// CompileTimePolymorphism.java

// Compile-Time Polymorphism (Method Overloading)

class Calculator {

    // Method 1: doo integer add krenge 
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: double values add krenge 
    double add(double a, double b) {
        return a + b;
    }

    // Method 3: tin numbers add krenge
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Sum of 2 integers: " + calc.add(2, 3));
        System.out.println("Sum of 2 doubles: " + calc.add(2.5, 3.5));
        System.out.println("Sum of 3 integers: " + calc.add(1, 2, 3));
    }
}
