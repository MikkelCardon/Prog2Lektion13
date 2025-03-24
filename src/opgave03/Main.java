package opgave03;

import opgave03.models.College_Set;
import opgave03.models.Student;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        College_Set college = new College_Set("Eaa");
        college.addStudent(new Student(1, "Mikkel", List.of(7, 10, 4, 2, 10)));
        college.addStudent(new Student(2, "Flemming", List.of(2, 10, 4, 2, 10)));
        college.addStudent(new Student(3, "Søren", List.of(2, 10, 4, 2, 10)));
        college.addStudent(new Student(4, "Bente", List.of(2, 10, 4, 2, 10)));

        System.out.println(college.calcAverage());
    }
}
