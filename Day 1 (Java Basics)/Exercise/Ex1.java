// Putting It All Together (Variable and data types)

public class Main {
    public static void main(String[] args) {
        
        // Variables
        String name = "Prince";
        int age = 30;
        int year = 2025;
        double price = 199999.99;
        double gpa = 3.5;
        char grade = 'A';
        char currency = '$';
        boolean forSale = true;
        String car = "Mustang";
        String color = "red";

        // Combined Output
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your GPA is " + gpa);
        System.out.println("Your average letter grade is " + grade);
        System.out.println("Your choice is a " + color + " " + year + " " + car);
        System.out.println("The price is " + currency + price);

        if (forSale) {
            System.out.println("There is a " + car + " for sale");
        } else {
            System.out.println(car + " is not for sale");
        }
    }
}
