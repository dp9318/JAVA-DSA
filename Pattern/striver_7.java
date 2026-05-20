public class striver_7 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=i; j<5; j++){
                System.out.print(" ");
            }
            for(int p=0; p<i*2-1; p++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
