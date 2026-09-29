import java.util.*;

class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.println("Length: " + s.length());
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());
        System.out.println("Reverse: " + new StringBuilder(s).reverse());

        StringBuffer sb = new StringBuffer(s);
        sb.append(" Java");
        sb.insert(0, "Hello ");
        System.out.println("StringBuffer: " + sb);
        System.out.println("Capacity: " + sb.capacity());

        long t1 = System.nanoTime();
        for (int i = 0; i < 10000; i++) s.concat("x");
        long t2 = System.nanoTime();

        long t3 = System.nanoTime();
        for (int i = 0; i < 10000; i++) sb.append("x");
        long t4 = System.nanoTime();

        System.out.println("String time: " + (t2 - t1));
        System.out.println("StringBuffer time: " + (t4 - t3));
    }
}