import java.util.Scanner;

public class throws_in_java {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        checkAge(age);
        sc.close();
    }
    public static void checkAge(int age){

        if(age<18){
            throw new ArithmeticException("Access denied : You must be over 18 to proceed!");
        }
        else{
            System.out.println("Access Granted!");
        }
    }
    
}
