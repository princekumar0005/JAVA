//This program demonstrates how to accept user input using the Scanner class to calculate a total price based on an item name, unit price, and quantity.

import java.util.Scanner;

public class Xps {

    public static void main(String[] args) {

        // 1. Create a Scanner object to accept user input
        Scanner scanner = new Scanner(System.in);

        // 2. Declare variables at the top
        String item;
        double price;
        int quantity;
        char currency = '$'; // Initialize with a currency symbol
        double total;

        // 3. User prompts and inputs
        System.out.print("What item would you like to buy? ");
        item = scanner.nextLine(); 

        System.out.print("What is the price for each? ");
        price = scanner.nextDouble(); 

        System.out.print("How many would you like? ");
        quantity = scanner.nextInt(); 

        // 4. Calculations
        total = price * quantity; 

        // 5. Final Output
        System.out.println("\nYou have bought " + quantity + " " + item + "(s)"); 
        System.out.println("Your total is " + currency + total); 

        // 6. Close the scanner
        scanner.close(); 
    }
}

