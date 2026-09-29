import java.util.*;

class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        Integer x = a;
        int b = x;

        Double d = 25.5;
        double y = d;

        System.out.println("Primitive int: " + a);
        System.out.println("Integer wrapper: " + x);
        System.out.println("Unboxed int: " + b);
        System.out.println("Double wrapper: " + d);
        System.out.println("Unboxed double: " + y);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(10);
        list.add(20);

        System.out.println(list);
    }
}