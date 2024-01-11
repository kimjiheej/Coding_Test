import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static boolean visitied[];
    static int cnt = 0;
    static ArrayList<Integer>[] A;



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());

        visitied = new boolean[n + 1];
        A = new ArrayList[n + 1];

        for (int i = 1; i < n + 1; i++)
            A[i] = new ArrayList<Integer>();

        for (int i = 0; i < b; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            A[a].add(c);
            A[c].add(a);

        }

        visitied[1] = true;

        find(0,1);

        for(int i=2; i<visitied.length; i++){
            if(visitied[i]) {
                cnt++;
            }
        }

        System.out.println(cnt);

    }

    public static void find(int depth, int start) {

        if(depth == 2){
            return;
        }

        for(int i=0; i<A[start].size(); i++){
            int next = A[start].get(i);
            visitied[next] = true;
            find(depth+1,next);
        }
    }
}
