public class Strings {
    public static void main(String[] args) {
        String name = "Dipankar";

        int len = name.length();

        System.out.println(name+ " name's length = " + len);

        System.out.println("uppercasing the name = "+ name.toUpperCase());
        System.out.println("lolwercasing the name = "+ name.toLowerCase());
        
        String myself = "Hello, I am Dipankar kumar and currently I am doing my masters in computer application from MANIT";

        System.err.println(myself.indexOf("kumar")); //this returns the starting indec of the provided text

        System.out.println(name.charAt(3));

        String name2 = "Dipankar";
        String name3 = "Kumar";

        System.out.println(name.equals(name2)); //true if same, false if different
        System.out.println(name.equals(name3));

        String txt = "     hello dp     ";
        System.out.println("Before [" + txt + "]"); //remove the white spaces from the start and end of string
        System.out.println("After ["+ txt.trim() + "]");

        //concatenation
        System.out.println("Dipankar " + "is a guitarist."); //manally
        String n1 = "Dipankar ";
        String n2 = "is a guitarist.";
        String n3 = n1.concat(n2); //using concat() fuction
        System.out.println(n3);

        int x = 10;
        int y = 30;
        System.out.println("as integers(x+y): " + (x+y));
        String x1 = "10";
        String y1 = "30";
        System.out.println("as strings(x+y): " + (x1+y1));

        String z = x + y1;
        System.out.println("x is integer = 10, y1 is a string = \"20\" and z = x+y1: " + z);
        // for printing special characters like " or ' or \ we use it as: \" , \', \\

        /*
        For priniting escape sequesnces
        code            result
        \n	            New Line	
        \t	            Tab	
        \b	            Backspace	
        \r	            Carriage Return	
        \f	            Form Feed

        */
    }
}
