public class exception_handling {
    public static void main(String[] args) {
        
        try{
            // this is a try block where we write code which may or maynot trigger errors
            int[] arr = {1,2,3,4};
            System.out.println(arr[9]); // Since the the array is of 4 elements and having the max index 3, so it will definetly give an error
        }
        catch(Exception e){
            // this is the catch block where we handle the exceptions
            System.out.println("Array out of bound !");
            // so this will print instead of the array elememnt that is not exist
        }
    }
    
}
