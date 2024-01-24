import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.*;

public class Main {

    static char[][] map;
    static int [][] dist1; // 불이 퍼지는 속도
    static int [][] dist2; // 지훈이가 탈출할 수 있는 속도

    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};


    public static void main(String[] args) throws IOException {
        // 미리 각 칸에 불이 전파된느 시간을 다 구해두자
        // 그 다음에는 지훈이에 대한 bfs 를 돌린다

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());

        map = new char[a][b];
        dist1 = new int[a][b];
        dist2 = new int[a][b];

        int c;
        int d;

        Queue<int[]> q = new LinkedList<>();
        Queue<int[]> q1 = new LinkedList<>();

        for(int i=0; i<a; i++){
            String s;
            s = br.readLine();
            for(int j=0; j<b; j++) {
                map[i][j] = s.charAt(j);
                if(map[i][j]=='F') {
                    q.add(new int[]{i, j}); // 불이 퍼지는 공간의 좌표를 넣는다
                }
                else if(map[i][j]=='J'){
                    q1.add(new int[]{i,j});
                }
            }
        }



   // 이게 불이 난 위치까지의 거리를 다 저장해놓은 것이다
      while(!q.isEmpty()){

          int[] temp = q.poll();
          int x = temp[0]; // 이게 좌표이다 처음 시작의
          int y = temp[1];

          for(int i=0; i<4; i++){
              int dix = x + dx[i];
              int diy = y + dy[i];
             // 범위 체크를 먼저 해주기 !!
              if (dix < 0 || diy < 0 || dix >= a || diy >= b || map[dix][diy] !='.') {
                  continue;
              }
              if(dist1[dix][diy] >0)
                  continue;
                  dist1[dix][diy] = dist1[x][y] +1;
                  q.add(new int[] {dix,diy});
          }
      }

      // 그럼 이제 지훈이가 탈출할 수 있냐 없냐를 따져야 한다

        while(!q1.isEmpty()){
            int[] temp = q1.poll();
            int x = temp[0];
            int y = temp[1];

            for(int i=0; i<4; i++){
                int dix = x+dx[i];
                int diy = y+dy[i];

                if( dix<0 || dix >=a || diy < 0 || diy >=b ) {
                    System.out.println(dist2[x][y] + 1);
                    return ;
                }
                if(dist2[dix][diy] >0 || map[dix][diy] != '.')
                    continue;
                if(dist1[dix][diy] > 0 && dist1[dix][diy] <= dist2[x][y]+1)
                    continue;

                dist2[dix][diy] = dist2[x][y] + 1;
                q1.add(new int[] {dix,diy});
            }
        }

    System.out.println("IMPOSSIBLE");
    }
}
