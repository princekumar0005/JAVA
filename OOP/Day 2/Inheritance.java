//Inheritance (Simple & Multi-level)
//Inheritance allows a subclass to reuse code from a superclass using the extends keyword.

/*Multiple Inheritance: Java does not support multiple 
inheritance with classes to avoid the Diamond Problem
(ambiguity in which method to call).*/

// Parent Class (Super Class)
class Inheritance /*Student*/ {
    String name;
    int age;

    public void markAttendance() {
        System.out.println("Attendance marked for student.");
    }
}

// Child Class (Sub Class)
class EngineeringStudent extends Student {
    public void attendLab() {
        System.out.println("Engineering lab attended.");
    }
}

// Multi-level Inheritance
class CSEStudent extends EngineeringStudent {
    public void attendCSLab() {
        System.out.println("Specific CS Lab attended.");
    }
}

