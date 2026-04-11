public class variables_datatype {
    public static void main(String[] args) {

      //1. Integers (int):Integers are primitive data types used for whole numbers. 
        // Step 1: Declaration
        int age; 
        int year;
        int quantity;

        // Step 2: Assignment
        age = 21;
        year = 2025;
        quantity = 1;

        System.out.println(age);
        System.out.println("The year is " + year);
        System.out.println(quantity);

      //2. Doubles (double):Doubles are used for numbers that contain decimal portions.

        double price = 19.99;
        double gpa = 3.5;
        double temperature = -12.5;

        System.out.println("$" + price);

     //3. Characters (char):Characters store a single character or symbol and are enclosed in single quotes.
      
      char grade = 'A';
      char symbol = '!';
      char currency = '$';

      System.out.println(grade);

   //4. Booleans (boolean):Booleans store true or false values, often used for conditional logic.

      
      boolean isStudent = true;
      boolean forSale = false;
      boolean isOnline = true;

      if (isStudent) {
           System.out.println("You are a student");
      } else {
           System.out.println("You are not a student");
      }
  // 5. Strings (String):Strings are reference data types that store a sequence of characters, enclosed in double quotes.

      String name = "Prince";
      String food = "pizza";
      String email = "fake123@gmail.com";
      String car = "Mustang";
      String color = "red";

      System.out.println("Hello " + name);
      System.out.println("Your favorite food is " + food);

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


