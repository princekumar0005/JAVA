public class Main {
    public static void main(String[] args) {

        // 1. Declare variables
        boolean isStudent = true; // Set to true or false for testing 
        boolean isSenior = true;  // Set to true or false for testing 
        double price = 9.99;

        // 2. Main If-Else Block (Checking Student Status)
        if (isStudent) { [00:01:14]
            
            // Nested If-Else Block (Checking Senior status within Student block)
            if (isSenior) { [00:03:39]
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student discount of 10%");
                price *= 0.7; // Combined 30% discount 
            } else {
                System.out.println("You get a student discount of 10%");
                price *= 0.9; // 10% discount 
            }
            
        } else {
            
            // Nested If-Else Block (Checking Senior status within Non-Student block)
            if (isSenior) {
                System.out.println("You get a senior discount of 20%");
                price *= 0.8; // 20% discount 
            } else {
                price *= 1;   // No discount 
            }
        }

        // 3. Formatted Output using printf
        // %.2f limits the output to two decimal places 
        System.out.printf("The price of a ticket is $%.2f", price); 
    }
}

