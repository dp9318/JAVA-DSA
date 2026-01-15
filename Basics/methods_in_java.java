public class methods_in_java {
    public static void main(String[] args) {
        hello(); // function/method call
        name("Dipankar");
    }

    // method with it's scope(accessibility)
    protected static void hello(){
        System.out.println("Hello World!");
    }

    // method with scope and parameter i.e. String ur_name, where string is the type and variable name is ur_name
    public static void name(String ur_name){
        System.out.println(ur_name);
    }

    // void in the function is the return type
    
}

/*  We use static keyword just to justify java that the function or 
    the variable is of that specific class which we can access withought 
    creating any instance within the class*/