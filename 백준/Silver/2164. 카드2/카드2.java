
import java.util.Scanner;
import java.util.*;

public class Main {

    // algo1874
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        n = sc.nextInt();

        Queue myQueue = new LinkedList();

        int i,j;

        for(i=1; i<=n; i++)
            myQueue.add(i);

        for(j=0; j<n-1; j++){
            myQueue.poll();

            int k = (int) myQueue.poll();
            myQueue.add(k);
        }

        System.out.println(myQueue.poll());
    }
}