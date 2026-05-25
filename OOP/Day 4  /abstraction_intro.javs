// Introduction to Abstraction in Java

/*
Abstraction:
-------------
Abstraction is the process of hiding implementation details
and showing only essential functionality to the user.

In Java, abstraction is achieved using:
1. Abstract Class
2. Interface

Real-Life Example:
------------------
When you drive a car, you use steering, brake, and accelerator.
You do not know the internal engine working.
This is called abstraction.
*/

abstract class Animal {

    // Abstract method (no body)
    abstract void sound();

    // Normal method
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Child class
class Dog extends Animal {

    // Providing implementation of abstract method
    void sound() {
        System.out.println("Dog barks");
    }
}

public class abstraction_intro{

    public static void main(String[] args) {

        // Creating object of child class
        Dog d = new Dog();

        // Calling methods
        d.sound();
        d.sleep();
    }
}
