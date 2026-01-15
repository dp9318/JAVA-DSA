public class while_do_while_loops {
    public static void main(String[] args) {
        
        int i=0;

        // this is while loop and it only works when the condition is true
        while(i<5){
            System.out.print(i + " ");
            i++;
        }

        // this is do-while loop
        // the first iteration will perform then the loop will check the condition
        do{
            System.out.print(i + " ");
            i--;
        }while(i>0);
        // in every scenario, a do-while loop will run atleast once
        // so if you want your program to run atleast once then go for the do-while loop

    }
    
}
