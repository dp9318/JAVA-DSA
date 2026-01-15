public class method_overloading {
    public static void main(String[] args) {

        // this is how you call overloaded functions with respect to their parameters and return type
        System.out.println(sum(2,3));
        System.out.println(sum(2,3,5));
        System.out.println(sum(2,3,5,10));
        System.out.println(sum(10.2f,6.8f));
        
    }

    public static int sum(int a, int b){
        return a+b;
    }
    
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    
    public static int sum(int a, int b, int c, int d){
        return a+b+c+d;
    }
    
    // given the three methods of sum, you can see the basic functionality is the same but we have different or say more parameteres
    
    public static float sum(float a, float b){
        return a+b;
    }
    // in the above method we change the return type and also the parameter type


    // all these are the example of method overloading

}
