//What are Logical Operators?
// Used to combine multiple conditions
//Result is always true or false

public class Main {
    public static void main(String[] args) {

      //1. AND Operator (&&)
     // Returns true only if both conditions are true

        int a = 10;
        int b = 5;

        System.out.println(a > 5 && b > 2); // true
        System.out.println(a > 5 && b > 10); // false

      //2. OR Operator (||)
      //Returns true if at least one condition is true

      System.out.println(a > 5 || b > 10); // true
      System.out.println(a < 5 || b > 10); // false


     // 3. NOT Operator (!)
     // Reverses the result

      System.out.println(!(a > 5)); // false
      System.out.println(!(a < 5)); // true

    
    }
}
