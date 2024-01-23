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
    static boolean[][] visit;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Queue<int[]> q = new LinkedList<>();

        map = new int[n][m];
        visit = new boolean[n][m];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
          for(int j=0; j<m; j++) {
              map[i][j] = Integer.parseInt(st.nextToken());
          }
        }

        int max = 0; // 그림의 최댓값
        int num = 0; // 그림의 수이다

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(map[i][j] == 0 || visit[i][j])
                    continue;
                num++;
                visit[i][j] = true;
                q.offer(new int[] {i,j});
                int area = 0;

                while(!q.isEmpty()){
                    area++;
                    int[] temp = q.poll(); // 일단 x 와 y 좌표를 활용해서 양옆위아래를 봐주어야 한다
                    int x = temp[0];
                    int y = temp[1];

                    for(int dir=0; dir<4; dir++){
                        int nx = x+ dx[dir];
                        int ny = y + dy[dir];

                        if(nx < 0 || ny<0 || nx >=n || ny>=m)
                            continue;
                        if(visit[nx][ny] || map[nx][ny] !=1 )
                            continue;
                        visit[nx][ny] = true;
                        q.offer(new int[]{nx,ny});
                    }
                }
                max = Math.max(max,area);
            }
        }

        System.out.println(num);
        System.out.println(max);
    }
}
