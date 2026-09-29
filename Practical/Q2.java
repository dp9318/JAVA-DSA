import java.util.*;

class Q2 {
    static boolean prime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) return false;
        return true;
    }

    static boolean armstrong(int n) {
        int x = n, sum = 0, d = String.valueOf(n).length();
        while (x > 0) {
            int r = x % 10;
            sum += (int)Math.pow(r, d);
            x /= 10;
        }
        return sum == n;
    }

    static boolean palindrome(int n) {
        int x = n, r = 0;
        while (x > 0) {
            r = r * 10 + x % 10;
            x /= 10;
        }
        return r == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;

        do {
            System.out.println("\n1.Factorial 2.Prime 3.Armstrong 4.Palindrome 5.Fibonacci 6.Exit");
            ch = sc.nextInt();

            if (ch == 1) {
                int n = sc.nextInt();
                long f = 1;
                for (int i = 1; i <= n; i++) f *= i;
                System.out.println(f);
            } else if (ch == 2) {
                System.out.println(prime(sc.nextInt()));
            } else if (ch == 3) {
                System.out.println(armstrong(sc.nextInt()));
            } else if (ch == 4) {
                System.out.println(palindrome(sc.nextInt()));
            } else if (ch == 5) {
                int n = sc.nextInt(), a = 0, b = 1;
                for (int i = 0; i < n; i++) {
                    System.out.print(a + " ");
                    int c = a + b;
                    a = b;
                    b = c;
                }
                System.out.println();
            }
        } while (ch != 6);
    }
}