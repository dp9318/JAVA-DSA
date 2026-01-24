public class classes_in {
    int x = 5; // content of class

    // constructor is used to initialize the class and can be overloaded like normal methods with different parameters
    public classes_in(){
        x = 10;
    }

    public classes_in(int y){
        x = y;
    }

    public static void main(String[] args) {
        //below is the new instance of class classes_in.java and through that we can access contents of that class if the scope is set to public or protected
        classes_in newclass = new classes_in();

        System.out.println(newclass.x);

        // we can create as much instance of same class as we want with different parameters of constructors
        classes_in newclass02 =  new classes_in(9);
        System.out.println(newclass02.x);

        // here we can also access methods using the instance
        System.out.println(newclass02.add(10,5));
    }
    
    public int add(int a, int b){
        return a+b;
    }
}
