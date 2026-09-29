class Student {
    String name;
    int roll;

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
}

class Examination extends Student {
    int marks;

    Examination(String name, int roll, int marks) {
        super(name, roll);
        this.marks = marks;
    }
}

class Result extends Examination {
    Result(String name, int roll, int marks) {
        super(name, roll, marks);
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Marks: " + marks);
        System.out.println("Result: " + (marks >= 40 ? "Pass" : "Fail"));
    }
}

class Q15 {
    public static void main(String[] args) {
        Result r = new Result("Dipankar", 101, 85);
        r.display();
    }
}