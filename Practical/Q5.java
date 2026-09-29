import java.util.*;

class Q5 {
    static int linear(int[] a, int x, int[] count) {
        for (int i = 0; i < a.length; i++) {
            count[0]++;
            if (a[i] == x) return i;
        }
        return -1;
    }

    static int binary(int[] a, int x, int[] count) {
        int l = 0, h = a.length - 1;
        while (l <= h) {
            int m = (l + h) / 2;
            count[0]++;
            if (a[m] == x) return m;
            if (a[m] < x) l = m + 1;
            else h = m - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Size: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        Arrays.sort(a);

        System.out.print("Search value: ");
        int x = sc.nextInt();

        int[] c1 = {0}, c2 = {0};

        System.out.println("Linear Search: " + linear(a, x, c1));
        System.out.println("Comparisons: " + c1[0]);

        System.out.println("Binary Search: " + binary(a, x, c2));
        System.out.println("Comparisons: " + c2[0]);
    }
}