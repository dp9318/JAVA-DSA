import java.util.*;

class Q6 {
    static void bubble(int[] a) {
        for (int i = 0; i < a.length - 1; i++)
            for (int j = 0; j < a.length - i - 1; j++)
                if (a[j] > a[j + 1]) {
                    int t = a[j]; a[j] = a[j + 1]; a[j + 1] = t;
                }
    }

    static void selection(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int p = i;
            for (int j = i + 1; j < a.length; j++)
                if (a[j] < a[p]) p = j;
            int t = a[i]; a[i] = a[p]; a[p] = t;
        }
    }

    static void insertion(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int x = a[i], j = i - 1;
            while (j >= 0 && a[j] > x) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = x;
        }
    }

    static void merge(int[] a, int l, int r) {
        if (l >= r) return;
        int m = (l + r) / 2;
        merge(a, l, m);
        merge(a, m + 1, r);

        int[] t = new int[r - l + 1];
        int i = l, j = m + 1, k = 0;

        while (i <= m && j <= r)
            t[k++] = a[i] < a[j] ? a[i++] : a[j++];

        while (i <= m) t[k++] = a[i++];
        while (j <= r) t[k++] = a[j++];

        System.arraycopy(t, 0, a, l, t.length);
    }

    static void quick(int[] a, int l, int r) {
        if (l >= r) return;
        int i = l, j = r, p = a[(l + r) / 2];

        while (i <= j) {
            while (a[i] < p) i++;
            while (a[j] > p) j--;
            if (i <= j) {
                int t = a[i]; a[i] = a[j]; a[j] = t;
                i++; j--;
            }
        }

        quick(a, l, j);
        quick(a, i, r);
    }

    static void show(int[] a) {
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int[][] result = new int[5][];
        result[0] = a.clone();
        result[1] = a.clone();
        result[2] = a.clone();
        result[3] = a.clone();
        result[4] = a.clone();

        bubble(result[0]);
        selection(result[1]);
        insertion(result[2]);
        merge(result[3], 0, n - 1);
        quick(result[4], 0, n - 1);

        for (int[] x : result) {
            show(x);
            for (int i = 0, j = n - 1; i < j; i++, j--) {
                int t = x[i]; x[i] = x[j]; x[j] = t;
            }
            show(x);
        }
    }
}