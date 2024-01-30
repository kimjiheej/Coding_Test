import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.*;

public class Main {


    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};

    static char map[][];

    static boolean visited[][];

    static int W;
    static int B;

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int garo = Integer.parseInt(st.nextToken()); // 가로
        int sero = Integer.parseInt(st.nextToken()); // 세로

        visited = new boolean[sero][garo];
        map = new char[sero][garo];

        for (int i = 0; i < sero; i++) {
            String str = br.readLine();

            for (int j = 0; j < garo; j++) {
                map[i][j] = str.charAt(j);
            }
        }
        B = 0;
        W = 0;

        int BR = 0;
        int WR = 0;

        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < sero; i++) {
            for (int j = 0; j < garo; j++) {

                if (visited[i][j] == true)
                    continue;

                q.add(new int[]{i, j});
                visited[i][j] = true;

                B = 0;
                W = 0;

                while (!q.isEmpty()) {
                    int[] temp = q.poll();

                    int x = temp[0];
                    int y = temp[1];

                    if(map[x][y]=='W')
                        W++;
                    else
                        B++;

                    if (map[x][y] == 'W') {
                        for (int k = 0; k < 4; k++) {
                            int dix = x + dx[k];
                            int diy = y + dy[k];

                            if (dix < 0 || diy < 0 || dix >= sero || diy >= garo)
                                continue;
                            if (visited[dix][diy] == true || map[dix][diy] == 'B')
                                continue;

                            q.add(new int[]{dix, diy});
                            visited[dix][diy] = true;

                        }
                    } else {
                        for (int k = 0; k < 4; k++) {
                            int dix = x + dx[k];
                            int diy = y + dy[k];

                            if (dix < 0 || diy < 0 || dix >= sero || diy >= garo)
                                continue;
                            if (visited[dix][diy] == true || map[dix][diy] == 'W')
                                continue;
                            q.add(new int[]{dix, diy});
                            visited[dix][diy] = true;

                        }

                    }

                }

                if(W>0 && B==0)
                    WR += W * W;
                else
                    BR += B * B;
            }


        }

        System.out.println(WR + " " + BR);
    }
}
