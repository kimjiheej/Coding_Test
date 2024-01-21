import java.io.*;
import java.util.ArrayDeque;
import java.util.StringTokenizer;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        LinkedList<Integer> deque = new LinkedList<Integer>();

        int count = 0;

        int N = in.nextInt();
        int M = in.nextInt();

        for(int i=1; i<=N; i++)
            deque.addLast(i);

        int[] seq = new int[M];

        for(int i=0; i<M; i++){
            seq[i] = in.nextInt();
        }

        for(int i=0; i<M; i++){
            int target_idx = deque.indexOf(seq[i]);
            int half_idx;

            if(deque.size()%2==0){
                half_idx = deque.size()/2-1;
            }else {
                half_idx = deque.size()/2;
            }

            if(target_idx <= half_idx){
                for(int j=0; j<target_idx; j++){
                    int t = deque.pollFirst();
                    deque.addLast(t);
                    count++;
                }
            }
            else {
                for(int j =0; j<deque.size() - target_idx; j++)
                {
                    int temp = deque.pollLast();
                    deque.addFirst(temp);
                    count++;
                }
            }
            
            deque.pollFirst();
        }
        
        System.out.println(count);
    }

}
