//The super Keyword
//The super keyword is used to refer to the immediate parent class object (variables, methods, or constructors).
//Super Keyword: Used to invoke parent constructors and parent methods

class Person {
    String name;

    // Constructor of Parent
    Person(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    int id;

    Employee(String name, int id) {
        super(name); // Calling Parent Constructor
        this.id = id;
    }

    @Override
    void display() {
        super.display(); // Calling Parent Method
        System.out.println("ID: " + id);
    }
}

// Main Class
public class superKeyword {
    public static void main(String[] args) {
        Employee emp = new Employee("Prince", 101);
        emp.display();
    }
}
