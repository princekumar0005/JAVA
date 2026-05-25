// ==========================================
// 1. ABSTRACT PARENT CLASS
// ==========================================
abstract class Shape {

    // Abstract method (No body, must be implemented by child classes)
    abstract double area();

    // Concrete method (Regular method, inherited by child classes)
    void display() {
        System.out.println("this is a shape");
    }
}

// ==========================================
// 2. CHILD CLASSES (SUBCLASSES)
// ==========================================
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

// ==========================================
// 3. MAIN EXECUTION CLASS
// ==========================================
public class Main {
    public static void main(String[] args) {

        // Note: The line below would cause a compilation error because Shape is abstract:
        // Shape shape = new Shape(); 

        // Create concrete objects
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4, 5);
        Rectangle rectangle = new Rectangle(6, 7);

        // Call the inherited concrete method (.display())
        circle.display();
        triangle.display();
        rectangle.display();

        System.out.println("-------------------------");

        // Call the implemented abstract method (.area())
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Rectangle Area: " + rectangle.area());
    }
}

