public class striver_8 {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int p=9; p>i*2; p--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
