import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int map[][];
    static boolean visitied[];

    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int com = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        map = new int[com+1][com+1];
        visitied = new boolean[com+1];

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            map[a][b] = 1;
            map[b][a] = 1;

        }

        dfs(1);


        System.out.println(count-1);
    }

    public static void dfs(int u){
        visitied[u] = true;
        count++;

        for(int i=1; i<visitied.length; i++){
            if(map[u][i] == 1 && !visitied[i])
                dfs(i);
        }

    }

}
