import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.err.println("Enter your choice: ");
            System.out.println("1. print hello \n2. print bye \n3. exit");
            System.out.print("fill your choice: ");
            int n = sc.nextInt();
            switch(n){
                case 1: 
                    System.err.println("Hello!");
                    break;
                case 2:
                    System.out.println("Bye!");
                    break;
                case 3:
                    System.out.println("Exiting....");
                    //here i want to break out of the while loop
                    sc.close();
                    return;
                default:
                    System.out.println("Pleaase enter a valid option.");
            }
        }
    }
    
}
