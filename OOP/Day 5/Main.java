// 1. Interfaces (Blueprints for classes)
interface Prey {
    void flee();
}

interface Predator {
    void hunt();
}

// 2. Class implementing a single interface
class Rabbit implements Prey {
    @Override
    public void flee() {
        System.out.println("The rabbit is running away");
    }
}

// 3. Another class implementing a single interface
class Hawk implements Predator {
    @Override
    public void hunt() {
        System.out.println("The hawk is hunting");
    }
}

// 4. Class demonstrating MULTIPLE inheritance-like behavior using interfaces
class Fish implements Prey, Predator {
    @Override
    public void flee() {
        System.out.println("The fish is swimming away");
    }

    @Override
    public void hunt() {
        System.out.println("The fish is hunting");
    }
}

// 5. Main execution class (Must be public and match file name)
public class Main {
    public static void main(String[] args) {
        
        // Testing single interface implementation
        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        System.out.println("--------------------");

        // Testing multiple interface implementation
        Fish fish = new Fish();
        fish.flee();
        fish.hunt();
    }
}
