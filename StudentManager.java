import java.util.ArrayList;

public class StudentManager {

    ArrayList<Student> students = new ArrayList<>();

    void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student student : students) {
            student.displayStudent();
        }
    }

    void searchStudent(int id) {

        for (Student student : students) {

            if (student.id == id) {
                System.out.println("Student found:");
                student.displayStudent();
                return;
            }
        }

        System.out.println("Student not found.");
    }

    void deleteStudent(int id) {

        for (Student student : students) {

            if (student.id == id) {
                students.remove(student);
                System.out.println("Student deleted successfully!");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    void showStatistics() {

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        double totalMarks = 0;

        for (Student student : students) {
            totalMarks = totalMarks + student.marks;
        }

        double average = totalMarks / students.size();

        System.out.println("Total Students: " + students.size());
        System.out.println("Average Marks: " + average);
    }
}
