public class break_continue {
    public static void main(String[] args) {
        
        // to break out of the loop we use break statements
        // or if you want to somehow stop the flow of program then use break statements
        // generally you have seen it in switch-case statements or while loop

        int num=0;
        for(int i=0; i<10; i++){
            num = num*i + i;
            System.err.print(num + " ");

            if(num>10){
                System.out.print("\nExited...");
                break;
            }
        }
        System.out.println();
        // Here we had a simple expression num=num*i+i; 
        // A condition if num ever exceeds by 10(num>10) then we should break out of the loop
        
        
        // Now working on Continue statement

        // the same code with slightly different condition
        int new_num = 0;
        for(int i=0; i<10; i++){
            new_num = new_num*i + i;
            if(new_num<10){
                System.out.print("\nLow value: " + new_num);
                continue;
            }

            // this if statement doesnt let the below line work until the if-statement is false as you see in the output
            System.out.println();
            System.err.print(new_num + " ");
        }

        // Here we have take a new variable just to not mess-up the value of num.
        // What 'continue;' statement does is that, it skips the current iteration and go to the next iteration
        // In the output, you will notice that the value that are being skipped are the values which are printed in the previous loop

        
    }
    
}
