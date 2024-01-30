import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.*;

public class Main {

    static long visitied[];

    static long count = 0;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long a= Long.parseLong(st.nextToken());
        long b= Long.parseLong(st.nextToken());

       Queue<Long> que = new LinkedList<>();
       que.add(a);

       int answer = 0;

       while(!que.isEmpty()){
           int size = que.size();

           for(int i=0; i<size; i++){
               long now = que.poll();
               if(now == b){
                   System.out.println(answer+1);
                   return;
               }
               if(now*2<=b)
                   que.add(now*2);
               if(now * 10 + 1 <=b)
                   que.add(now * 10 + 1);
           }
           answer++;
       }
       System.out.println(-1);
    }
}
