import java.io.*;
import java.util.*;
public class Main {



    public static int[][] map ; // 노드가 연결된 정보
    public static boolean[] visited; // 노드 방문 여부
    public static int result = 0; // 연결된 노드 횟수

    public static void solution(){
    
        for(int i=1; i<visited.length;i++){
            if(!visited[i])
            {
                dfs(i);
                result++;
            }
        }
    }
    public static void dfs(int u){
        visited[u] = true;
        
        for(int i=1; i<visited.length;i++){
            if(map[u][i] == 1 && !visited[i])
                dfs(i);
        }
    }

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        map = new int[n+1][n+1];
        visited = new boolean[n+1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            map[u][v] = 1;
            map[v][u] = 1;
        }

        solution();
        bw.write(result+"");

        br.close();
        bw.close();
    }
    }

