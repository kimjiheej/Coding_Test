import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<n; i++){

            int k = Integer.parseInt(br.readLine());

            if(k>0)
                q.add(k);
            else if(k==0 && q.isEmpty()){
                sb.append("0\n");
            }
            else
            {
                sb.append(q.poll()+"\n");
            }
        }

        System.out.print(sb.toString());
    }
}
