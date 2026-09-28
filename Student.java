public class Student {

    int id;
    String name;
    int age;
    double marks;

    Student(int id, String name, int age, double marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    void displayStudent() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + getGrade());
        System.out.println("----------------------");
    }

    String getGrade() {

        if (marks >= 90) {
            return "A+";
        } 
        else if (marks >= 80) {
            return "A";
        } 
        else if (marks >= 70) {
            return "B";
        } 
        else if (marks >= 60) {
            return "C";
        } 
        else if (marks >= 50) {
            return "D";
        } 
        else {
            return "F";
        }
    }
}
