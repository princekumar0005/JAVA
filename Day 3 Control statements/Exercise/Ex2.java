//Rolling Three Dice (1-100 Range)
//The video also shows how to generate multiple random numbers simultaneously by updating the bounds


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        Random random = new Random();

        int number1;
        int number2;
        int number3;

        // Generating three random numbers between 1 and 100
        number1 = random.nextInt(1, 101);
        number2 = random.nextInt(1, 101);
        number3 = random.nextInt(1, 101);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
    }
}
