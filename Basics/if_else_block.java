public class if_else_block {
    public static void main(String[] args) {
        boolean isRaining = true;

        //1st block
        if(isRaining){
            isRaining = false;
            System.out.println("It is raining");
        }
        else{
            System.out.println("It is not raining.");
        }
        //1st block ends here after else{}


        //2nd block

        if(isRaining){
            System.out.println("It is raining.");
        }
        else if( !isRaining){
            System.out.println("it is not raining.");
            isRaining=true;
        }
        else{
            System.out.println("nothing happened.");
        }

        //2nd block ends here


        //3rd block 

        // short hand if else block which reduces the loc
        // variable = (condition) ? trueCondition : falseCondition;  **the resultsant is saved in the variable**
        String result = (isRaining) ? "it is raining(true)" : "it is not raining(false)";
        System.out.println(result);
        
    }
}
