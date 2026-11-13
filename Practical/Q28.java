import java.util.*;
import java.util.stream.*;

class StudentScore {
    String name;
    int score;

    StudentScore(String name, int score) {
        this.name = name;
        this.score = score;
    }

    String getName() {
        return name;
    }

    int getScore() {
        return score;
    }
}

class Q28 {
    public static void main(String[] args) {
        List<StudentScore> students = Arrays.asList(
            new StudentScore("Dipankar", 85),
            new StudentScore("Rahul", 42),
            new StudentScore("Sneha", 91),
            new StudentScore("Amit", 74),
            new StudentScore("Priya", 68)
        );

        System.out.println("Passed Students (Score >= 50):");
        students.stream()
            .filter(s -> s.getScore() >= 50)
            .forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));

        double average = students.stream()
            .mapToInt(StudentScore::getScore)
            .average()
            .orElse(0.0);
        System.out.println("\nClass Average: " + average);

        long highScorers = students.stream()
            .filter(s -> s.getScore() >= 80)
            .count();
        System.out.println("High Scorers (Score >= 80): " + highScorers);

        List<String> upperNames = students.stream()
            .map(s -> s.getName().toUpperCase())
            .collect(Collectors.toList());
        System.out.println("Uppercase Names: " + upperNames);
    }
}

