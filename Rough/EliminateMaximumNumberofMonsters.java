import java.util.Scanner;

// This is a Leetcode problem of ARRAYS: 1921

public class EliminateMaximumNumberofMonsters {
    public static void main(String[] args) {
        System.out.print("Enter the no. of Monsters: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("Enter the distances of monsters: ");
        int[] dist = new int[num];
        for(int i=0; i<num; i++){
            dist[i]=sc.nextInt();
        }
        System.out.print("\nEnter the speed: ");
        int[] speed = new int[num];
        for(int i=0; i<num; i++){
            speed[i] = sc.nextInt();
        }

        System.out.println("No. of mosters defeated: " + eliminateMaximum(dist, speed));
    }

    public static int eliminateMaximum(int[] dist, int[] speed) {
        int j=0;
        int[] dist_cpy = dist;
        int[] speed_cpy = speed;
        do{
            dist[j]=dist[j]-speed[j];
        }while();



        // int count = 1;
        // for(int i=1; i<dist.length; i++){
        //     for(int j=0; j<dist.length; j++){
        //         dist[j]=dist[j]-speed[j];
        //     } 
        //     if(dist[i]<=0){
        //         break;
        //     }
        //     count++;
        // }
        return count;
    }
    
}
