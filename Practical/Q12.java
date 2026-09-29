package Practical;

package mathutil;

public class MathUtil {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    public static double mean(int[] a) {
        int s = 0;
        for (int x : a) s += x;
        return (double)s / a.length;
    }

    public static double area(double r) {
        return Math.PI * r * r;
    }
}


class Q12 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};

        System.out.println("Addition: " + MathUtil.add(5, 3));
        System.out.println("GCD: " + MathUtil.gcd(20, 8));
        System.out.println("Mean: " + MathUtil.mean(a));
        System.out.println("Circle Area: " + MathUtil.area(5));
    }
}
