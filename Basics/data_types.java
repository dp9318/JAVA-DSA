public class data_types {
    public static void main(String[] args) {
        System.out.println("Integer = " + Integer.BYTES + " bytes");
        System.out.println("Char = " + Character.BYTES + " bytes");
        System.out.println("Float = " + Float.BYTES + " bytes");
        System.out.println("Double = " + Double.BYTES + " bytes");

        // Java doesn't define fixed size for these:
        System.out.println("Boolean = JVM dependent");
        System.out.println("String = depends on string length + char size");


        // constant variables can be written with initials start with final keyword
        final int myroll = 9318;

        // myroll = myroll + 10; this is not legal in JAVA as myroll variable is a constant variable with final keyword

        System.out.println(myroll);
    }
}
