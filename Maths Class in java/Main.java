//Basic Math Class Constants and Methods

public class Main {
    public static void main(String[] args) {
        
        // Constants
        System.out.println(Math.PI); // Value of Pi [00:00:11]
        System.out.println(Math.E);  // Euler's number [00:00:34]

        double result;

        // Common Math Methods
        result = Math.pow(2, 3);    // 2 to the power of 3 (8.0) [00:01:02]
        result = Math.abs(-5);       // Absolute value (5.0) [00:01:41]
        result = Math.sqrt(9);       // Square root (3.0) [00:02:13]
        result = Math.round(3.14);   // Rounds to nearest (3.0) [00:02:34]
        result = Math.ceil(3.14);    // Rounds up (4.0) [00:02:57]
        result = Math.floor(3.99);   // Rounds down (3.0) [00:03:11]
        result = Math.max(10, 20);   // Maximum value (20.0) [00:03:35]
        result = Math.min(10, 20);   // Minimum value (10.0) [00:03:57]

        System.out.println(result);
    }
}
