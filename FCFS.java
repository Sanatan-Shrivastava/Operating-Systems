/**
 * FCFS
 */
import java.util.*;
class FCFS {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter Number of Process: ");
         int N = in.nextInt();
         int[] pid = new int[N];
         int[] arrivalTime = new int[N];
         int[] burstTime = new int[N];
        for(int i = 0; i < N; i++) {
           pid[i] = in.nextInt();
        }

        for(int i = 0; i < N; i++) {
           arrivalTime[i] = in.nextInt();
        }

        for(int i = 0; i < N; i++) {
            burstTime[i] = in.nextInt();
        }

        findFCFS(arrivalTime, burstTime, N);
     }


     private static void findFCFS(int[] at, int[] bt, int N) {
         Arrays.sort(at);

         int[] waitingTime= new int[N];
         
         
     }
}