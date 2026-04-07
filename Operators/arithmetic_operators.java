// 1. Basic Arithmetic Operators: These are the standard mathematical operations
public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 2;
        int z;

        z = x + y;       // Addition (+) -> 12
        z = x - y;       // Subtraction (-) -> 8
        z = x * y;       // Multiplication (*) -> 20
        z = x / y;       // Division (/) -> 5
        z = x % y;       // Modulus (%) -> 0 (remainder of division)

        // Modulus example with remainder
        // 10 % 3 = 1 (since 3 goes into 10 three times with 1 left over)
        
        System.out.println(z);

  // 2. Augmented Assignment Operators :These are shortcuts to update the value of a variable based on its current value.

        int a = 10;
        int b = 3;

        a += b;  // Equivalent to a = a + b -> 13
        a -= b;  // Equivalent to a = a - b -> 7
        a *= b;  // Equivalent to a = a * b -> 30
        a /= b;  // Equivalent to a = a / b -> 3 (Integer division drops decimals)
        a %= b;  // Equivalent to a = a % b -> 1

        System.out.println(a);
      
    
 // 3. Increment and Decrement Operators : Commonly used in loops to increase or decrease a value by exactly 1.

       int c = 1;

       c++; // Increment: c = c + 1 -> 2
       c--; // Decrement: c = c - 1 -> 0

       System.out.println(c);
      

       
    }
}

// 4. Order of Operations (PEMDAS)
     //Java follows the standard order of operations: Parentheses, Exponents, Multiplication, Division, Addition, Subtraction.
public class Main {
    public static void main(String[] args) {
        
        // Example equation
        double result = 3 + 4 * (7 - 5) / 2.0;
        
        /* Step-by-step resolution:
           1. Parentheses: (7 - 5) = 2
           2. Multiplication: 4 * 2 = 8
           3. Division: 8 / 2.0 = 4.0
           4. Addition: 3 + 4.0 = 7.0
        */

        System.out.println(result); // Outputs: 7.0
    }
}
