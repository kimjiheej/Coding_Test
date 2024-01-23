import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.*;

public class Main {

    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};

    static int[][] map;
    static int[][] visit;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Queue<int[]> q = new LinkedList<>();

        map = new int[n][m];
        visit = new int[n][m];

        for(int i=0; i<n; i++){
            String row = br.readLine();
            for(int j=0; j<m; j++){
                map[i][j] = row.charAt(j) - '0';
            }
        }

           q.add(new int[] {0,0}); // 처음에 시작 점을 넣어준다
        visit[0][0] = 1;

        while(!q.isEmpty()){

            int[] array = q.poll();
            int x = array[0];
            int y = array[1];

            // x 와 y 좌표를 꺼내준다

            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx < 0 || ny < 0 || nx >=n || ny >=m)
                    continue;
                if(visit[nx][ny]>0 || map[nx][ny] != 1)
                    continue;

                visit[nx][ny] = visit[x][y]+1;
                q.add(new int[] {nx,ny});
            }
        }
        System.out.println(visit[n-1][m-1]);
        }
    }

