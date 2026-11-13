import java.util.*;

class Q25 {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        int[] ids = {104, 101, 105, 102, 103};
        String[] names = {"David", "Alice", "Eva", "Bob", "Charlie"};

        for (int i = 0; i < ids.length; i++) {
            hashMap.put(ids[i], names[i]);
            linkedHashMap.put(ids[i], names[i]);
            treeMap.put(ids[i], names[i]);
        }

        System.out.println("HashMap (Hash-based order):");
        for (Map.Entry<Integer, String> e : hashMap.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        System.out.println("\nLinkedHashMap (Insertion order):");
        for (Map.Entry<Integer, String> e : linkedHashMap.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        System.out.println("\nTreeMap (Sorted key order):");
        for (Map.Entry<Integer, String> e : treeMap.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        System.out.println("\nSearch ID 103 in HashMap: " + hashMap.get(103));
        System.out.println("Search ID 103 in LinkedHashMap: " + linkedHashMap.get(103));
        System.out.println("Search ID 103 in TreeMap: " + treeMap.get(103));
    }
}

