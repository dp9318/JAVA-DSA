import java.util.Scanner;

public class recursion {
    static void recur(int n){
        if(n>=1){
            recur(n-1);
            System.out.print(n+" ");
            recur(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        recur(n);
        sc.close();
    }
    
}
