import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {


    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static boolean[][] visitied;

    static char[][] map;

    static boolean[][] visitied1;
    static char[][] map1;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        visitied = new boolean[n][n];
        map = new char[n][n];

        visitied1 = new boolean[n][n];
        map1 = new char[n][n];

        for (int i = 0; i < n; i++) {
            String stt = br.readLine(); // 제발 이거 꼭 기억하기 문장 받을 때에 이차원 배열에 토크나이저 안쓰고 그냥 넣는다 !!
            for (int j = 0; j < n; j++) {
                map[i][j] = stt.charAt(j);
                if (map[i][j] == 'G') {
                    map1[i][j] = 'R';
                } else {
                    map1[i][j] = stt.charAt(j);
                }
            }
        }

        Queue<int[]> q = new LinkedList<>();

        // 일단 전체를 다 돌리고 R.G.B 일때에 각각 해주면 될듯

        int total = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (visitied[i][j] == true) // 방문했으면 맞는것이고
                    continue;
                total++;
                // 그게 아니면 일단 큐에 넣는다
                q.add(new int[]{i, j});
                visitied[i][j] = true;

                if (map[i][j] == 'R') {
                    // 하나씩 계산하면서 BFS 를 돌아준다
                    // 즉 인덱스의 범위를 확인해 주어야 한다

                    while (!q.isEmpty()) {
                        int[] temp = q.poll();
                        int x = temp[0];
                        int y = temp[1];

                        for (int k = 0; k < 4; k++) {
                            int dix = x + dx[k];
                            int diy = y + dy[k];

                            if (dix < 0 || diy < 0 || dix >= n || diy >= n)
                                continue;
                            if (map[dix][diy] != 'R' || visitied[dix][diy] == true)
                                continue;

                            q.add(new int[]{dix, diy});
                            visitied[dix][diy] = true;
                        }
                    }
                } else if (map[i][j] == 'G') {

                    while (!q.isEmpty()) {
                        int[] temp = q.poll();
                        int x = temp[0];
                        int y = temp[1];

                        for (int k = 0; k < 4; k++) {
                            int dix = x + dx[k];
                            int diy = y + dy[k];

                            if (dix < 0 || diy < 0 || dix >= n || diy >= n)
                                continue;
                            else if (map[dix][diy] != 'G' || visitied[dix][diy] == true)
                                continue;

                            q.add(new int[]{dix, diy});
                            visitied[dix][diy] = true;
                        }
                    }


                } else if (map[i][j] == 'B') {

                    while (!q.isEmpty()) {
                        int[] temp = q.poll();
                        int x = temp[0];
                        int y = temp[1];

                        for (int k = 0; k < 4; k++) {
                            int dix = x + dx[k];
                            int diy = y + dy[k];

                            if (dix < 0 || diy < 0 || dix >= n || diy >= n)
                                continue;
                            else if (map[dix][diy] != 'B' || visitied[dix][diy] == true)
                                continue;

                            q.add(new int[]{dix, diy});
                            visitied[dix][diy] = true;
                        }
                    }

                }

            }
        }

        int total1 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (visitied1[i][j] == true) // 방문했으면 맞는것이고
                    continue;
                total1++;
                // 그게 아니면 일단 큐에 넣는다
                q.add(new int[]{i, j});
                visitied1[i][j] = true;

                if (map1[i][j] == 'R') {
                    // 하나씩 계산하면서 BFS 를 돌아준다
                    // 즉 인덱스의 범위를 확인해 주어야 한다

                    while (!q.isEmpty()) {
                        int[] temp = q.poll();
                        int x = temp[0];
                        int y = temp[1];

                        for (int k = 0; k < 4; k++) {
                            int dix = x + dx[k];
                            int diy = y + dy[k];

                            if (dix < 0 || diy < 0 || dix >= n || diy >= n)
                                continue;
                            if (map1[dix][diy] != 'R' || visitied1[dix][diy] == true)
                                continue;

                            q.add(new int[]{dix, diy});
                            visitied1[dix][diy] = true;
                        }
                    }
                } else if (map1[i][j] == 'B') {

                    while (!q.isEmpty()) {
                        int[] temp = q.poll();
                        int x = temp[0];
                        int y = temp[1];

                        for (int k = 0; k < 4; k++) {
                            int dix = x + dx[k];
                            int diy = y + dy[k];

                            if (dix < 0 || diy < 0 || dix >= n || diy >= n)
                                continue;
                            else if (map1[dix][diy] != 'B' || visitied1[dix][diy] == true)
                                continue;
                            q.add(new int[]{dix, diy});
                            visitied1[dix][diy] = true;
                        }
                    }
                }
            }
        }

        System.out.println(total + " " + total1);
    }
}
