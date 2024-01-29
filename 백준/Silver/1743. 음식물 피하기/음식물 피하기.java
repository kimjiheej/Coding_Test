import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.*;

public class Main {

    static int[][] map;
    static int[][] visitied;

    static int result;

    static int max;

    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sero = Integer.parseInt(st.nextToken());
        int garo = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());

        map = new int[sero+1][garo+1];
        visitied = new int[sero+1][garo+1];

        for(int i=0; i<num; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a][b] = 1;
        }



        result = 0;
        max  = 0;

        Queue<int[]> q = new LinkedList<>();

        for(int i=1; i<=sero ; i++){
            for(int j=1; j<=garo; j++) {

                if (map[i][j] ==0 || visitied[i][j] > 0)
                    continue;

                visitied[i][j] = 1;
                q.add(new int[]{i, j});
                result = 0;

                while (!q.isEmpty()) {
                    result++;
                    int[] tmp = q.poll();
                    int x = tmp[0];
                    int y = tmp[1];

                    for (int k = 0; k < 4; k++) {
                        int dix = x + dx[k];
                        int diy = y + dy[k];

                        if (dix < 0 || diy < 0 || dix > sero || diy > garo)
                            continue;

                        if (visitied[dix][diy] > 0 || map[dix][diy] ==0)
                            continue;

                        q.add(new int[]{dix, diy});
                        visitied[dix][diy] = 1;
                    }

                }
               max  = Math.max(max,result);
            }
        }

      System.out.print(max);

    }
}
