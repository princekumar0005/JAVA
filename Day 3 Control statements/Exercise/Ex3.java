//Generating Doubles and Booleans (Coin Flip)

//how to generate random decimals (doubles) and booleans to simulate a coin flip

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        Random random = new Random();

        // Generate a random double between 0.0 and 1.0
        double decimal = random.nextDouble();
        System.out.println(decimal);

        // Generate a random boolean (true or false) for a coin flip
        boolean isHeads = random.nextBoolean();

        if (isHeads) {
            System.out.println("HEADS");
        } else {
            System.out.println("TAILS");
        }
    }
}
