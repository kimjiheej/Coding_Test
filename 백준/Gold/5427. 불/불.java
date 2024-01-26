import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.*;

public class Main {


    static int visitied[][];
    static int visitied1[][];

    static char[][] map;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine()); // 몇번 돌릴지의 개수이다


        for (int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int garo = Integer.parseInt(st.nextToken()); // 4
            int sero = Integer.parseInt(st.nextToken()); // 3

            boolean check = false;

            map = new char[sero][garo];
            visitied = new int[sero][garo];
            visitied1 = new int[sero][garo];


            Queue<int[]> q = new LinkedList<>();
            Queue<int[]> q1 = new LinkedList<>();
            for (int j = 0; j < sero; j++) {
                String str = br.readLine();
                for (int k = 0; k < garo; k++) {
                    map[j][k] = str.charAt(k);

                    if (map[j][k] == '*') // 만약 불이 시작하는 곳이라면
                    {
                        q.add(new int[]{j, k});
                    } else if (map[j][k] == '@') {
                        q1.add(new int[]{j, k});
                    }
                }
            }


            //    일단 불이 갈 수 있는 곳 다 넣기 .. 이렇게 다 넣어봐라 !!
            while (!q.isEmpty()) {
                int[] temp = q.poll();
                int x = temp[0];
                int y = temp[1];

                for (int j = 0; j < 4; j++) {
                    int dix = x + dx[j];
                    int diy = y + dy[j];

                    if (dix < 0 || diy < 0 || dix >= sero || diy >= garo)
                        continue;
                    if (map[dix][diy] != '.' || visitied[dix][diy] > 0)
                        continue;

                    visitied[dix][diy] = visitied[x][y] + 1;
                    q.add(new int[]{dix, diy});
                }
            }

            while((!q1.isEmpty()) && (!check)){
                int[] temp = q1.poll();
                int x = temp[0];
                int y = temp[1];

                for (int j = 0; j < 4; j++) {
                    int dix = x + dx[j];
                    int diy = y + dy[j];

                    if (dix < 0 || diy < 0 || dix >= sero || diy >= garo) {
                        sb.append((visitied1[x][y] + 1) + "\n");
                        check = true;
                        break;
                    }
                    if(visitied1[dix][diy]>0 || map[dix][diy] != '.')
                        continue;
                    // 방문했던 인
                    if(visitied[dix][diy]>0 && visitied[dix][diy] <= visitied1[x][y] + 1)
                        continue;

                    visitied1[dix][diy] = visitied1[x][y] + 1;
                    q1.add(new int[] {dix,diy});
                }
            }

            if(!check)
                sb.append("IMPOSSIBLE\n");

        }

        System.out.println(sb.toString());
    }
}

