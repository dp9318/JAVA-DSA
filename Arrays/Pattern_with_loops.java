package Arrays;
import java.util.Scanner;

public class Pattern_with_loops {
    public static void main(String[] args) {
        //printing a suare in java 
        System.out.println("This is a square from the user input:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of columns: ");
        int n = sc.nextInt();


        // Classic example of prinitng a square matrix 
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
