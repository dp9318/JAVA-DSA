import java.util.*;

class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Rows and columns: ");
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] a = new int[r][c], b = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) a[i][j] = sc.nextInt();

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) b[i][j] = sc.nextInt();

        System.out.println("Addition/Subtraction:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                System.out.print((a[i][j] + b[i][j]) + " ");
            System.out.println();
        }

        System.out.println("Subtraction:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                System.out.print((a[i][j] - b[i][j]) + " ");
            System.out.println();
        }

        System.out.println("Transpose:");
        for (int j = 0; j < c; j++) {
            for (int i = 0; i < r; i++) System.out.print(a[i][j] + " ");
            System.out.println();
        }

        int d1 = 0, d2 = 0;
        for (int i = 0; i < Math.min(r, c); i++) {
            d1 += a[i][i];
            d2 += a[i][c - 1 - i];
        }

        System.out.println("Diagonal sums: " + d1 + " " + d2);

        boolean upper = true, lower = true, symmetric = r == c;

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                if (i > j && a[i][j] != 0) upper = false;
                if (i < j && a[i][j] != 0) lower = false;
                if (symmetric && a[i][j] != a[j][i]) symmetric = false;
            }

        System.out.println("Upper Triangular: " + upper);
        System.out.println("Lower Triangular: " + lower);
        System.out.println("Symmetric: " + symmetric);

        if (r == c) {
            int[][] mul = new int[r][c];
            for (int i = 0; i < r; i++)
                for (int j = 0; j < c; j++)
                    for (int k = 0; k < c; k++)
                        mul[i][j] += a[i][k] * b[k][j];

            System.out.println("Multiplication:");
            for (int[] x : mul) {
                for (int y : x) System.out.print(y + " ");
                System.out.println();
            }
        }
    }
}