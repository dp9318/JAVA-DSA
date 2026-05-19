public class diamond {
    public static void main(String[] args) {
        for(int i=0; i<=5; i++){
            for(int j=i; j<5; j++){
                System.out.print(" ");
            }
            for(int p=0; p<i*2-1; p++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<=5; i++){
            for(int p=0; p<i; p++){
                System.out.print(" ");
            }
            for(int j=0; j<10-i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
