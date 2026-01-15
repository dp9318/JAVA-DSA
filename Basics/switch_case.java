import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {

        // Here we are creating an object of the pre-defined class Scanner which helps us to take user-input
        Scanner sc = new Scanner(System.in);

        // Here's  an example of while loop
        while (true) {
            System.err.println("Enter your choice: ");
            System.out.println("1. print hello \n2. print bye \n3. exit");
            System.out.print("fill your choice: ");

            // This is how we take input from the user using the scanner class's object (sc)
            int n = sc.nextInt();

            //Here is an example of how wee use switch case statements
            switch(n){
                case 1: 
                    System.err.println("Hello!");
                    break;
                case 2:
                    System.out.println("Bye!");
                    break;
                case 3:
                    System.out.println("Exiting....");
                    sc.close();
                    //here i want to break out of the while loop
                    return; //this return closes the entire program
                default:
                    System.out.println("Pleaase enter a valid option.");
            }
        }
    }
    
}
