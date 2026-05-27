// ============================================================================
// CONCEPT 1: THE PACKAGE DECLARATION
// ============================================================================
// This MUST be the very first line of code. It defines the "home folder" of this file.
package com.tutorial.main;

// ============================================================================
// CONCEPT 2: THE IMPORTS (Your Speed-Dial)
// ============================================================================
// 1. Specific Import: Brings in exactly one class.
import java.util.ArrayList;

// 2. Wildcard Import (*): Brings in all public classes from java.util (like List, Scanner).
import java.util.*;

// 3. Static Import: Imports static elements directly so you don't type the Class name.
import static java.lang.Math.PI;
import static java.lang.Math.pow;


public class PackageMasterClass {

    public static void main(String[] args) {
        System.out.println("========= JAVA PACKAGES DEMO =========");

        // --------------------------------------------------------------------
        // CONCEPT 3: SELF-CONTAINED VS EXTERNAL PACKAGES
        // --------------------------------------------------------------------
        // We can use ArrayList directly because we explicitly imported it above.
        ArrayList<String> topics = new ArrayList<>();
        topics.add("Declarations");
        topics.add("Imports");
        System.out.println("1. Loaded using Specific Import: " + topics);

        // --------------------------------------------------------------------
        // CONCEPT 4: THE AUTOMATIC IMPORT (java.lang)
        // --------------------------------------------------------------------
        // Notice we never imported 'String' or 'System'. Java automatically 
        // imports the 'java.lang' package into every single file behind the scenes.
        String automaticBypass = "2. java.lang classes require zero imports.";
        System.out.println(automaticBypass);

        // --------------------------------------------------------------------
        // CONCEPT 5: STATIC IMPORTS IN ACTION
        // --------------------------------------------------------------------
        // Because of our static import of PI and pow, we write cleaner formulas:
        double radius = 3.0;
        double area = PI * pow(radius, 2); // Instead of Math.PI * Math.pow(...)
        System.out.println("3. Static Import Area calculation: " + area);

        // --------------------------------------------------------------------
        // CONCEPT 6: RESOLVING NAMING CONFLICTS (The "John" Problem)
        // --------------------------------------------------------------------
        // What if two different packages have a class with the exact same name?
        // (e.g., Simulated Shipping Order vs. Billing Order).
        // We use their "Fully Qualified Name" (Full Package Pathway) to distinguish them.

        com.tutorial.shipping.Order shippingOrder = new com.tutorial.shipping.Order();
        com.tutorial.billing.Order billingOrder = new com.tutorial.billing.Order();

        System.out.println("4. Conflict Resolved:");
        shippingOrder.process();
        billingOrder.process();
    }
}

// ============================================================================
// SIMULATED EXTERNAL PACKAGES (For Single-File Execution)
// ============================================================================
// Below, we create two distinct namespaces to mimic separate package files.

namespace com.tutorial.shipping {
    class Order {
        void process() {
            System.out.println("   -> [Shipping Package] Processing physical delivery cargo.");
        }
    }
}

namespace com.tutorial.billing {
    class Order {
        void process() {
            System.out.println("   -> [Billing Package] Processing credit card payment invoice.");
        }
    }
}

