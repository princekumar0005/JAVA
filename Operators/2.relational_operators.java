//What are Relational Operators?

//  These operators are used to compare two values
//  The result is always true or false (boolean)


//Types of Relational Operators
//  Operator.       Meaning                  Example
//    ==.           Equal to.                a == b
//.   !=.           Not equal.               a != b
//.    >            Greater than.             a > b
//.    <.            Less than.               a < b
//.    >=.           Greater than or equal    a >= b
//.    <=.           Less than or equal.      a <= b

public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.println(a == b); // false
        System.out.println(a != b); // true
        System.out.println(a > b);  // true
        System.out.println(a < b);  // false
        System.out.println(a >= b); // true
        System.out.println(a <= b); // false
    }
}
