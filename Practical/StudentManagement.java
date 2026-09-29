import java.util.Scanner;

class Student {
    private int rollNo;
    private String name;
    private double marks;

    Student() {
        rollNo = 0;
        name = "Unknown";
        marks = 0;
    }

    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    Student(Student s) {
        this.rollNo = s.rollNo;
        this.name = s.name;
        this.marks = s.marks;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + getGrade());
    }

    String getGrade() {
        if (marks >= 90)
            return "A";
        else if (marks >= 75)
            return "B";
        else if (marks >= 60)
            return "C";
        else if (marks >= 50)
            return "D";
        else
            return "F";
    }

    void setName(String name) {
        this.name = name;
    }

    void setMarks(double marks) {
        this.marks = marks;
    }
}

public class StudentManagement {

    static void displayStudent(Student s) {
        s.display();
    }

    static void updateStudent(Student s, String name, double marks) {
        s.setName(name);
        s.setMarks(marks);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        Student s1 = new Student(rollNo, name, marks);

        System.out.println("\nStudent Details:");
        displayStudent(s1);

        Student s2 = new Student(s1);

        System.out.println("\nCopied Student:");
        displayStudent(s2);

        sc.nextLine();

        System.out.print("\nEnter new name: ");
        String newName = sc.nextLine();

        System.out.print("Enter new marks: ");
        double newMarks = sc.nextDouble();

        updateStudent(s1, newName, newMarks);

        System.out.println("\nUpdated Student:");
        displayStudent(s1);

        sc.close();
    }
}