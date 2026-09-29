import java.util.*;

class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int a = sc.nextInt(), b = sc.nextInt();

        System.out.println("Arithmetic: " + (a + b) + " " + (a - b) + " " + (a * b) + " " + (a / b));
        System.out.println("Relational: " + (a > b) + " " + (a < b) + " " + (a == b));
        System.out.println("Logical: " + (a > 0 && b > 0) + " " + (a > 0 || b > 0));
        System.out.println("Bitwise: AND=" + (a & b) + " OR=" + (a | b) + " XOR=" + (a ^ b));
        System.out.println("Precedence: " + a + b * 2);
        System.out.println("Using parentheses: " + ((a + b) * 2));
    }
}