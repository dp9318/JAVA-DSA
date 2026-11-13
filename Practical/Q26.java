import java.util.*;

class StudentEntry implements Comparable<StudentEntry> {
    int roll;
    String name;
    double marks;

    StudentEntry(int roll, String name, double marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public int compareTo(StudentEntry other) {
        return Integer.compare(this.roll, other.roll);
    }

    public String toString() {
        return "Roll: " + roll + " | Name: " + name + " | Marks: " + marks;
    }
}

class MarksComparator implements Comparator<StudentEntry> {
    public int compare(StudentEntry s1, StudentEntry s2) {
        return Double.compare(s1.marks, s2.marks);
    }
}

class NameComparator implements Comparator<StudentEntry> {
    public int compare(StudentEntry s1, StudentEntry s2) {
        return s1.name.compareTo(s2.name);
    }
}

class Q26 {
    public static void main(String[] args) {
        List<StudentEntry> list = new ArrayList<>();
        list.add(new StudentEntry(103, "Charlie", 78.5));
        list.add(new StudentEntry(101, "Alice", 92.0));
        list.add(new StudentEntry(105, "Eva", 88.0));
        list.add(new StudentEntry(102, "Bob", 65.5));

        System.out.println("Original List:");
        for (StudentEntry s : list) {
            System.out.println(s);
        }

        Collections.sort(list);
        System.out.println("\nSorted by Roll (Comparable):");
        for (StudentEntry s : list) {
            System.out.println(s);
        }

        list.sort(new MarksComparator());
        System.out.println("\nSorted by Marks (Comparator):");
        for (StudentEntry s : list) {
            System.out.println(s);
        }

        list.sort(new NameComparator());
        System.out.println("\nSorted by Name (Comparator):");
        for (StudentEntry s : list) {
            System.out.println(s);
        }
    }
}

