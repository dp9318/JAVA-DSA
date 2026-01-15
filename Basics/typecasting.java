public class typecasting {
    public static void main(String[] args) {

        // we are taking the example of 65 as in ASCII value, 65 gives 'A'
        int num = 65;
        System.out.println(num);


        char ch = 'A';
        System.out.println(ch);
        
        // below we converted the character into an integer 
        int character = ch;
        // now you can see the ASCII value of letter which is present in the variable 'ch'
        System.out.println(character);


        // Again we can convert the character value into floating point number 
        // But yes, since it is a floating value, it will have decimal eg: 65.000....
        float fcharacter = ch;
        System.out.println(fcharacter);

        // Here we convert an integer into a double
        double number = num;
        System.out.println(number);

        // this type of typecasting is called manual typecasting
        System.out.println((byte)num);
        System.out.println((char)num);

        // Two types of typecasting happens in java
        // 1. is automatic
        // 2. is manual

        // In automatic we can go from lower bit data type to hiegher bit data types
        // byte -> short -> char -> int -> long -> float -> double

        // In manual, we can go from larger to smaller but generally it is not recommended in the start
    }
    
}
