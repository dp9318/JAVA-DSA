import java.util.Scanner;

public class Q8 {
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }

    static double power(double a, double b) {
        return Math.pow(a, b);
    }

    static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        return fact;
    }

    static boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static long fibonacci(int n) {
        if (n <= 1)
            return n;

        long a = 0, b = 1;

        for (int i = 2; i <= n; i++) {
            long c = a + b;
            a = b;
            b = c;
        }

        return b;
    }

    static void displayMenu() {
        System.out.println("\n1. GCD");
        System.out.println("2. LCM");
        System.out.println("3. Power");
        System.out.println("4. Factorial");
        System.out.println("5. Prime Check");
        System.out.println("6. Fibonacci");
        System.out.println("7. Exit");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            displayMenu();
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    System.out.println("GCD = " + gcd(sc.nextInt(), sc.nextInt()));
                    break;

                case 2:
                    System.out.print("Enter two numbers: ");
                    System.out.println("LCM = " + lcm(sc.nextInt(), sc.nextInt()));
                    break;

                case 3:
                    System.out.print("Enter base and exponent: ");
                    System.out.println("Result = " + power(sc.nextDouble(), sc.nextDouble()));
                    break;

                case 4:
                    System.out.print("Enter number: ");
                    System.out.println("Factorial = " + factorial(sc.nextInt()));
                    break;

                case 5:
                    System.out.print("Enter number: ");
                    System.out.println(isPrime(sc.nextInt()) ? "Prime" : "Not Prime");
                    break;

                case 6:
                    System.out.print("Enter position: ");
                    System.out.println("Fibonacci = " + fibonacci(sc.nextInt()));
                    break;

                case 7:
                    System.out.println("Program ended.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
