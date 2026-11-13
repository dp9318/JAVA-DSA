import java.util.*;

class Q24 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        arrayList.add("Dipankar");
        arrayList.add("Rahul");
        arrayList.add("Sneha");

        linkedList.add("Dipankar");
        linkedList.add("Rahul");
        linkedList.add("Sneha");

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        arrayList.remove("Rahul");
        linkedList.remove("Rahul");

        System.out.println("ArrayList after deletion: " + arrayList);
        System.out.println("LinkedList after deletion: " + linkedList);

        System.out.println("Search 'Sneha' in ArrayList: " + arrayList.contains("Sneha"));
        System.out.println("Search 'Sneha' in LinkedList: " + linkedList.contains("Sneha"));

        long t1 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.add("Record" + i);
        }
        long t2 = System.nanoTime();

        long t3 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.add("Record" + i);
        }
        long t4 = System.nanoTime();

        System.out.println("ArrayList insertion time: " + (t2 - t1) + " ns");
        System.out.println("LinkedList insertion time: " + (t4 - t3) + " ns");
    }
}

