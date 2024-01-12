import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static boolean visitied[];

    static int res = -1;

    static ArrayList<Integer>[] A;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());// 원소의 개수
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken()); // 받는 줄의 수


        visitied = new boolean[n+1];
        A = new ArrayList[n+1];
        for(int i = 1; i<n+1; i++){
            A[i] = new ArrayList<Integer>();
        }



        for(int i=0; i<num; i++){
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());

            A[p].add(q);
            A[q].add(p);
        }

        DFS(a,b,0);

System.out.println(res);

    }

    public static void DFS(int v , int b, int cnt){

        if(v==b) {
            res = cnt;
            return;
        }

        visitied[v] = true;
        for(int i=0; i<A[v].size(); i++){
            int next = A[v].get(i);
            if(!visitied[next])
                DFS(next,b,cnt+1);
        }


    }
}

