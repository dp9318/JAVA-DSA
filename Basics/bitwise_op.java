public class bitwise_op {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("printing 5 in binary: " + Integer.toBinaryString(num));

        // Operators:
        // and operator : &
        // or operator : |
        // not operator : ~
        // xor operator : ^
        // left shift : <<
        // right shift : >>
        // unsigned right shift : >>>
        int num2 = 4;
        System.out.println("printing 4 in binary: " + Integer.toBinaryString(num2));
        // int new_num = num & num2;
        System.out.println("performing and operation on 5&4 : " + Integer.toBinaryString(num&num2));

        System.out.println("Performonig or operation on 5|4: " + Integer.toBinaryString(num|num2));
    }
    
}
