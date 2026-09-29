import java.util.*;

class Q3 {
    static void print(int[] a, int n) {
        for (int i = 0; i < n; i++) System.out.print(a[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Size: ");
        int n = sc.nextInt();
        int[] a = new int[100];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        System.out.println("Original:");
        print(a, n);

        System.out.print("Insert position and value: ");
        int p = sc.nextInt(), v = sc.nextInt();
        for (int i = n; i > p; i--) a[i] = a[i - 1];
        a[p] = v;
        n++;

        System.out.print("Delete position: ");
        p = sc.nextInt();
        for (int i = p; i < n - 1; i++) a[i] = a[i + 1];
        n--;

        System.out.print("Search value: ");
        v = sc.nextInt();
        int pos = -1;
        for (int i = 0; i < n; i++) if (a[i] == v) pos = i;
        System.out.println("Position: " + pos);

        System.out.print("Update position and value: ");
        p = sc.nextInt();
        a[p] = sc.nextInt();

        for (int i = 0; i < n / 2; i++) {
            int t = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = t;
        }

        int max = a[0], min = a[0], second = Integer.MIN_VALUE, sum = 0;
        for (int x : a) {
            max = Math.max(max, x);
            min = Math.min(min, x);
            sum += x;
        }
        for (int x : a) if (x < max && x > second) second = x;

        System.out.println("Reversed:");
        print(a, n);
        System.out.println("Max=" + max + " Min=" + min + " Second Largest=" + second);
        System.out.println("Average=" + (double)sum / n);

        System.out.print("Second array size: ");
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) b[i] = sc.nextInt();

        int[] c = new int[n + m];
        System.arraycopy(a, 0, c, 0, n);
        System.arraycopy(b, 0, c, n, m);

        System.out.println("Merged:");
        print(c, c.length);
    }
}