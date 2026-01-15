public class for_loop {
    public static void main(String[] args) {

        // Normal for-loop in java
        for(int i=0; i<5; i++){
            System.err.println("Hello World! ");
        }
        

        // Nested for-loop in java
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.err.print("Hello ");
            }
            System.out.println();
        }


        // for arrays where the size is fixed, we can use other type of for loop 
        // also known as For-Each Loop

        //suppose an array having 10 elements such that:
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        for(int i : arr){
            System.out.print(i + " ");
        }
    } 
    
}
   