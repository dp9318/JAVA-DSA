import java.util.*;

class Student {
    int roll;
    String name;
    double marks;

    Student() {
        this(0, "Unknown", 0);
    }

    Student(int roll, String name, double marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println(roll + " " + name + " " + marks);
    }
}

class Q9 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(101, "Dipankar", 85.5);

        s1.display();
        s2.display();

        s2.marks = 90;
        s2.display();
    }
}