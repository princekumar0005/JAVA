//  RuntimePolymorphism.java

// Runtime Polymorphism (Method Overriding)

// Parent Class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child Class 1
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child Class 2
class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {

        // Upcasting (Parent reference → Child object)
        Animal obj;

        obj = new Dog();
        obj.sound();   // Calls Dog method

        obj = new Cat();
        obj.sound();   // Calls Cat method
    }
}
