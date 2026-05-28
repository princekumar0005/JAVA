

Student Management System (Java OOP Mini Project)

Overview

This is a simple Java mini project based on Object-Oriented Programming (OOP) concepts. The project demonstrates the use of:

- Class & Object
- Encapsulation
- Inheritance
- Abstraction
- Polymorphism
- Constructor
- Method Overriding
- ArrayList

The project stores and displays student information and calculates grades.

---

Technologies Used

- Java
- OOP Concepts
- VS Code / IntelliJ / Eclipse

---

Project Structure

StudentManagementSystem/
│
├── Student.java
├── RegularStudent.java
├── SportsStudent.java
├── Main.java
└── README.md

---

Features

- Add student records
- Display student details
- Calculate grades
- Different grading systems for different student types

---

Source Code

Student.java

abstract class Student {

    private int id;
    private String name;
    private double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    abstract String grade();

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

---

RegularStudent.java

class RegularStudent extends Student {

    RegularStudent(int id, String name, double marks) {
        super(id, name, marks);
    }

    @Override
    String grade() {

        if (getMarks() >= 80)
            return "A";

        else if (getMarks() >= 60)
            return "B";

        else
            return "C";
    }
}

---

SportsStudent.java

class SportsStudent extends Student {

    SportsStudent(int id, String name, double marks) {
        super(id, name, marks);
    }

    @Override
    String grade() {

        if (getMarks() >= 75)
            return "A";

        else if (getMarks() >= 50)
            return "B";

        else
            return "C";
    }
}

---

Main.java

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new RegularStudent(101, "Prince", 85));
        students.add(new RegularStudent(102, "Rahul", 65));
        students.add(new SportsStudent(103, "Aman", 78));

        for (Student s : students) {

            s.display();

            System.out.println("Grade: " + s.grade());

            System.out.println("------------------");
        }
    }
}

---

Output

ID: 101
Name: Prince
Marks: 85.0
Grade: A

ID: 102
Name: Rahul
Marks: 65.0
Grade: B

ID: 103
Name: Aman
Marks: 78.0
Grade: A

---

Conclusion

This project successfully demonstrates Java OOP concepts in a simple and practical way.

---

Author

Prince Kumar
