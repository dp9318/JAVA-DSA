public class arrays {
    public static void main(String[] args) {

        // we initialize or say predefined the size of array with the constructor
        int[] arr_num = new int[5]; 
        arr_num[0]=1;
        arr_num[1]=2;
        arr_num[2]=3;
        arr_num[3]=4;
        arr_num[4]=5;
        // arrays are started from index 0 in java


        String[] cars = {"BMW", "Mercedes", "Hundai", "Toyota", "Nissan", "Mitsubishi"};
        // this is an array of strings
        int count=1;
        System.out.println("Before change: ");
        // Here's an implementation of printing array from a for each loop 
        //Generally for-each loop is used when the size is unknown
        for(String i : cars){
            System.out.println(count++ + ". " + i);
        }


        //we can change the contents of any array with respect to it's index

        cars[2]="Porche";
        count=1;
        System.out.println("\nAfter change: ");
        // for(String i : cars){
        //     System.out.println(count++ + ". " + i);
        // }
        
        // cars.length will provide the size of array
        for(int i=0; i<cars.length; i++){
            System.out.println(count++ + ". " + cars[i]);
        }
        
        System.out.println();
        int[][] martix = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(martix[i][j] + " ");
            }
            System.out.println();
        }

        // This is how you access a multidimentional array using for-each loop
        System.out.println();
        for(int[] i : martix){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }
    
}
