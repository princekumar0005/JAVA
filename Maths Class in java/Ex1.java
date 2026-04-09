//Finding the Hypotenuse
//This program calculates the hypotenuse of a right triangle using the formula c = \sqrt{a^2 + b^2}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side a: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side b: ");
        b = scanner.nextDouble();

        // Formula: c = sqrt(a^2 + b^2)
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The hypotenuse (side c) is: " + c + "cm");

        scanner.close();
    }
}
