// Constructor.java

class Student {
    String name;
    int age;

    // Constructor
   //Constructor name = class name
   //No return type
    
  Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}

public class Constructor {
    public static void main(String[] args) {
        //Calls constructor automatically
        Student s1 = new Student("Prince", 21);
        s1.display();

     // Why constructor?
      // Without constructor: s1.name = "Prince";
      //With constructor:new Student("Prince", 21);
      
      
    }
}
