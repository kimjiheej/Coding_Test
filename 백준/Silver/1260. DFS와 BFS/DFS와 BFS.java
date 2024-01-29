import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.*;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class Main {

    static boolean visitied[];
    static int map[][];

    static boolean visited1[];

    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()); // 정점 개수
        int b = Integer.parseInt(st.nextToken()); // 간선 개수
        int c = Integer.parseInt(st.nextToken()); // 탐색을 시작할 번호



        visitied = new boolean[a + 1];
        map = new int[a + 1][a + 1];


        for (int i = 0; i < b; i++) {
            st = new StringTokenizer(br.readLine());
            int q = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            map[q][p] = 1;
            map[p][q] = 1;
        }

        visitied[c] = true;
        dfs(c);
        System.out.println();

        visited1 = new boolean[a + 1];

        visited1[c] = true;

        Queue<Integer> q = new LinkedList<>();

        q.add(c);
        System.out.print(c + " ");

        while (!q.isEmpty()) {

            int check = q.poll();
            for (int i = 1; i <= a; i++) {
                if (map[check][i] == 1 && visited1[i] == false) {
                    q.add(i);
                    visited1[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }
    

    public static void dfs(int u){

        visitied[u] = true;
        System.out.print(u+" ");

        for(int i=1; i<visitied.length; i++){
            if(!visitied[i] && map[u][i]==1)
            {
                dfs(i);
            }
        }
    }
}
