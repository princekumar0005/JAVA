//Calculating the Area of a Rectangle
//This exercise combines the concepts to build a small program.

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        // Note: For the superscript 2 (cm²), use Alt+0178 on Windows numpad
        System.out.println("The area is " + area + "cm²");

        scanner.close();
    }
}
