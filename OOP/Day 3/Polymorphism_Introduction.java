// Polymorphism_Introduction.java

/*
 * Polymorphism in Java - Introduction
 * 
 * Polymorphism means "many forms".
 * It allows one method to behave differently in different situations.
 * 
 * There are 2 types:
 * 1. Compile-Time Polymorphism (Method Overloading)
 * 2. Runtime Polymorphism (Method Overriding)
 */

// Parent Class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child Class
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Another Child Class
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Polymorphism_Introduction {

    // Method Overloading Example
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        // -----------------------------
        // Runtime Polymorphism Example
        // -----------------------------
        Animal obj;

        obj = new Dog();   // Dog object
        obj.sound();       // Output: Dog barks

        obj = new Cat();   // Cat object
        obj.sound();       // Output: Cat meows

        // -----------------------------
        // Compile-Time Polymorphism Example
        // -----------------------------
        System.out.println("Sum of 2 numbers: " + add(2, 3));
        System.out.println("Sum of 3 numbers: " + add(1, 2, 3));
    }
}
