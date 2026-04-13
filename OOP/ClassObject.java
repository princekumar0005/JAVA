// ClassObject.java

class Student {
    String name;  //  Variables → called instance variables
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ClassObject {
    public static void main(String[] args) {

        // Creating Object
        Student s1 = new Student();  //new → memory allocation

        // Assign values
        s1.name = "Prince";
        s1.age = 21;

        // Calling method
        s1.display();  // Calling method using object
    }
}
