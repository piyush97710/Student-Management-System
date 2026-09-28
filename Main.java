import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Show Statistics");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter Student ID: ");
                int id = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Age: ");
                int age = sc.nextInt();

                System.out.print("Enter Marks: ");
                double marks = sc.nextDouble();

                Student student = new Student(id, name, age, marks);

                manager.addStudent(student);

            } 
            else if (choice == 2) {

                manager.viewStudents();

            } 
            else if (choice == 3) {

                System.out.print("Enter Student ID to search: ");
                int id = sc.nextInt();

                manager.searchStudent(id);

            } 
            else if (choice == 4) {

                System.out.print("Enter Student ID to delete: ");
                int id = sc.nextInt();

                manager.deleteStudent(id);

            } 
            else if (choice == 5) {

                manager.showStatistics();

            } 
            else if (choice == 6) {

                System.out.println("Thank you for using the system!");
                break;

            } 
            else {

                System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}