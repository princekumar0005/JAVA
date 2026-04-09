// Generating Random Integers (Dice Roll)
//This snippet demonstrates how to import the Random class, create a random object, and generate integers within a specific range

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        // Create a Random object
        Random random = new Random();

        // Generate a random integer between 1 and 6 (like rolling a die)
        // The first number is inclusive, the second is exclusive
        int number = random.nextInt(1, 7); 

        System.out.println(number);
    }
}
