import java.io.*;
import java.util.*;



// DFS 로 풀 수 있는 문제입니다.
public class Main {

    static boolean[] visited;
    static ArrayList<Integer>[] A;
    static int count = 0;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int computer = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());

        visited = new boolean[computer +1 ];
        A = new ArrayList[computer+1];

        for(int i=1; i<computer+1; i++)
            A[i] = new ArrayList<Integer>();

        for(int i=0; i<num; i++)
        {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            A[s].add(e);
            A[e].add(s);
        }

        DFS(1);

        System.out.println(count-1);

    }

    public static void DFS(int v){

        if(visited[v] == true)
            return;

        visited[v] = true;
        count++;
        
            for(int i : A[v])
            {
                if(visited[i]== false)
                DFS(i);
        }
    }
}
