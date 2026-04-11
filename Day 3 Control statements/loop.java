public class loop {

    public static void main(String[] args) {

        // ================================
        // 1. FOR LOOP
        // ================================
        // Used when number of iterations is known
        System.out.println("1. FOR LOOP:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // ================================
        // 2. WHILE LOOP
        // ================================
        // Used when condition decides loop execution
        System.out.println("\n2. WHILE LOOP:");
        int j = 1;
        while (j <= 5) {
            System.out.println("j = " + j);
            j++;
        }

        // ================================
        // 3. DO-WHILE LOOP
        // ================================
        // Executes at least once
        System.out.println("\n3. DO-WHILE LOOP:");
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 5);

        // ================================
        // 4. ENHANCED FOR LOOP (FOR-EACH)
        // ================================
        // Used for arrays/collections
        System.out.println("\n4. ENHANCED FOR LOOP:");
        int[] arr = {10, 20, 30, 40};
        for (int num : arr) {
            System.out.println("Value = " + num);
        }

        // ================================
        // 5. BREAK STATEMENT
        // ================================
        // Stops loop immediately
        System.out.println("\n5. BREAK STATEMENT:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // exit loop
            }
            System.out.println("i = " + i);
        }

        // ================================
        // 6. CONTINUE STATEMENT
        // ================================
        // Skips current iteration
        System.out.println("\n6. CONTINUE STATEMENT:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // skip 3
            }
            System.out.println("i = " + i);
        }

        // ================================
        // 7. NESTED LOOPS
        // ================================
        // Loop inside another loop
        System.out.println("\n7. NESTED LOOPS:");
        for (int i = 1; i <= 3; i++) {
            for (int m = 1; m <= 2; m++) {
                System.out.println("i = " + i + ", m = " + m);
            }
        }

        // ================================
        // 8. INFINITE LOOP (COMMENTED)
        // ================================
        // Runs forever (use carefully)
        /*
        while (true) {
            System.out.println("Infinite Loop");
        }
        */

        // ================================
        // 9. REAL USE CASE EXAMPLES
        // ================================

        // Example 1: Print even numbers
        System.out.println("\n9. EVEN NUMBERS:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Example 2: Reverse a number
        System.out.println("\n10. REVERSE NUMBER:");
        int num = 1234;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        System.out.println("Reversed = " + reverse);

        // Example 3: Multiplication table
        System.out.println("\n11. MULTIPLICATION TABLE OF 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        // Example 4: Pattern printing
        System.out.println("\n12. PATTERN:");
        for (int i = 1; i <= 4; i++) {
            for (int m = 1; m <= i; m++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
