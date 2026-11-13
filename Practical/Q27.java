import java.util.*;

class Q27 {
    public static void main(String[] args) {
        int n = 50000;
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        long t1 = System.currentTimeMillis();
        for (int i = 0; i < n; i++) arrayList.add(i);
        long t2 = System.currentTimeMillis();
        System.out.println("ArrayList Add Time: " + (t2 - t1) + " ms");

        t1 = System.currentTimeMillis();
        for (int i = 0; i < n; i++) linkedList.add(i);
        t2 = System.currentTimeMillis();
        System.out.println("LinkedList Add Time: " + (t2 - t1) + " ms");

        t1 = System.currentTimeMillis();
        for (int i = 0; i < n; i++) hashSet.add(i);
        t2 = System.currentTimeMillis();
        System.out.println("HashSet Add Time: " + (t2 - t1) + " ms");

        t1 = System.currentTimeMillis();
        for (int i = 0; i < n; i++) treeSet.add(i);
        t2 = System.currentTimeMillis();
        System.out.println("TreeSet Add Time: " + (t2 - t1) + " ms");

        t1 = System.currentTimeMillis();
        arrayList.contains(n - 1);
        t2 = System.currentTimeMillis();
        System.out.println("ArrayList Search Time: " + (t2 - t1) + " ms");

        t1 = System.currentTimeMillis();
        linkedList.contains(n - 1);
        t2 = System.currentTimeMillis();
        System.out.println("LinkedList Search Time: " + (t2 - t1) + " ms");

        t1 = System.currentTimeMillis();
        hashSet.contains(n - 1);
        t2 = System.currentTimeMillis();
        System.out.println("HashSet Search Time: " + (t2 - t1) + " ms");

        t1 = System.currentTimeMillis();
        treeSet.contains(n - 1);
        t2 = System.currentTimeMillis();
        System.out.println("TreeSet Search Time: " + (t2 - t1) + " ms");
    }
}

