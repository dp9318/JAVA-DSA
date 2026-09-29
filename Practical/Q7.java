import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        // while(true){
            
        // }
        Scanner sc = new Scanner(System.in);
        // int l = sc.nextInt();
        // int b = sc.nextInt();
        // // number_pyramid(n);
        // hollow_rectangle(l, b);
        while(true){
            displayMenu();
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter hieght of Pyramid: ");
                    pyramid(sc.nextInt());
                    break;
                case 2: 
                    System.out.print("Enter hieght of Floyd's Triangle: ");
                    floyd(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Enter Pascal's Triangle Hieght: ");
                    System.out.print("Sorry, no function!");
                    break;
                case 4:
                    System.out.print("Enter Half Hieght of Diamond: ");
                    diamond(sc.nextInt());
                    break;
                case 5:
                    System.out.print("Enter the length and breath of Hollow Rectangle: ");
                    hollow_rectangle(sc.nextInt(), sc.nextInt());
                    break;
                case 6: 
                    System.out.print("Enter the hieght of Number Pyramid: ");
                    number_pyramid(sc.nextInt());
                    break;
                case 7: 
                    System.out.print("Exit!");
                    return;
                default:
                    System.out.println("Invalid Choice!");
                    break;
            }
        }

    }
    static void displayMenu(){
        System.out.println("\n1. Pyramid Pattern");
        System.out.println("2. Floyd's Pattern");
        System.out.println("3. Pascal Triangle");
        System.out.println("4. Diamond Pattern");
        System.out.println("5. Hollow Rectangle");
        System.out.println("6. Number Pyramid");
    }
    static void pyramid(int hieght){
        for(int i=1; i<=hieght; i++){
            for(int j=i; j<hieght; j++){
                System.out.print(" ");
            }
            for(int p=0; p<i*2-1; p++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void floyd(int n){
        int count=1;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
    static void diamond(int n){
        for(int i=1; i<=n; i++){
            for(int j=i; j<n; j++){
                System.out.print(" ");
            }
            for(int p=0; p<i*2-1; p++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<n-1; i++){
            for(int j=0; j<=i; j++){
                System.out.print(" ");
            }
            for(int p=(n-i-1)*2; p>1; p--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void hollow_rectangle(int l, int b){
        for(int i=0; i<l; i++){
            System.out.print("* ");
        }
        System.out.println();
        for(int i=1; i<b-1; i++){
            for(int j=0; j<l; j++){
                if(j==0 || j==l-1){
                    System.out.print("* ");
                }
                else{ System.out.print("  "); }
            }
            System.out.println();
        }
        for(int i=0; i<l; i++){
            System.out.print("* ");
        }
    }
    static void number_pyramid(int hieght){
        for(int i=1; i<=hieght; i++){
            for(int j=i; j<hieght; j++){
                System.out.print(" ");
            }
            for(int p=0; p<i*2-1; p++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
