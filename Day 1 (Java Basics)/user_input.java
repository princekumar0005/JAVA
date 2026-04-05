import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create scanner object
        Scanner scanner = new Scanner(System.in);

        // Code for user input goes here
        
        // String Input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); 

        // Integer Input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Double Input
        System.out.print("What is your CGP: ");
        double cgp = scanner.nextDouble();

       // Boolean Input
       System.out.print("Are you a student (true/false): ");
       boolean isStudent = scanner.nextBoolean();

       // Output the results
       System.out.println("Hello " + name);
       System.out.println("You are " + age + " years old");
       System.out.println("Your cgp is " + cgp);

       if (isStudent) {
          System.out.println("You are enrolled as a student");
       } else {
          System.out.println("You are not enrolled");
      }


      System.out.print("Enter your hight : ");
      int hight = scanner.nextInt();

      // Clear the input buffer
      scanner.nextLine(); 

      System.out.print("Enter your favorite color: ");
      String color = scanner.nextLine();

      System.out.println("You are " + age + " years old");
      System.out.println("You like the color " + color);


      // Close scanner at the end
      scanner.close();
    }
}
