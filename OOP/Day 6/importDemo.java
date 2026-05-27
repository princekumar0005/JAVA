// 1. PACKAGE DECLARATION
// If present, this MUST be the very first statement in the file.
package com.example.learning; 

// 2. SPECIFIC IMPORT (Recommended)
// Pulls in exactly one class. Clean and explicit.
import java.util.ArrayList;

// 3. WILDCARD IMPORT (*)
// Pulls in all public classes from java.time (e.g., LocalDate, LocalTime, LocalDateTime).
// Note: It does NOT pull in sub-packages (like java.time.format.*).
import java.time.*; 

// 4. STATIC IMPORTS
// Used to import static fields or methods so you can use them without the class prefix.
import static java.lang.Math.PI;    // Imports a static constant
import static java.lang.Math.sqrt;  // Imports a static method

// 5. THE CLASS DECLARATION
// All imports must sit ABOVE this line.
public class ImportDemo {

    public static void main(String[] args) {
        
        System.out.println("--- 1. Specific Import ---");
        // We imported java.util.ArrayList specifically at the top.
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        System.out.println("List element: " + list.get(0));


        System.out.println("\n--- 2. Wildcard Import (*) ---");
        // LocalDate is available because we used 'import java.time.*;'
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date: " + today);


        System.out.println("\n--- 3. Static Import ---");
        // Because of static imports, we don't have to write 'Math.PI' or 'Math.sqrt()'
        double radius = 5.0;
        double area = PI * (radius * radius);
        System.out.println("Area of circle: " + area);
        System.out.println("Square root of 81: " + sqrt(81));


        System.out.println("\n--- 4. Automatic 'java.lang' Import ---");
        // 'String' and 'System' are part of the 'java.lang' package.
        // Java imports this package automatically for every file behind the scenes.
        String message = "No import needed for String!";
        System.out.println(message);


        System.out.println("\n--- 5. Handling Naming Conflicts (Fully Qualified Names) ---");
        // Problem: Both 'java.util.Date' and 'java.sql.Date' exist.
        // If we import both, Java gets confused. 
        // Solution: Use the "Fully Qualified Name" (FQN) inline to tell them apart.
        
        java.util.Date utilityDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());
        
        System.out.println("Util Date: " + utilityDate);
        System.out.println("SQL Date: " + sqlDate);
    }
}
