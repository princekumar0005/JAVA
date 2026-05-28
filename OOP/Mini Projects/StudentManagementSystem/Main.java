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
