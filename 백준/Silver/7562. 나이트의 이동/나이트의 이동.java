import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.*;

public class Main {

    static int[][] array;
    static int[][] visitied;

    static int[] dx = {-2,-1,1,2,2,1,-1,-2};
    static int [] dy = {-1,-2,-2,-1,1,2,2,1};
//
//    static int[] dx = {2, 1, -1, -2, -2, -1, 1, 2};
//    static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());




        for(int i=0; i<a; i++){

            int b = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine()); // start 지점

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine()); // end 지점
            int x1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());

            array = new int[b][b];
            visitied = new int[b][b];

            Queue<int[]> q = new LinkedList<>();
            q.add(new int[]{x,y}); // 큐에다가 좌표를 넣는다
            visitied[x][y] = 0;

            if(x==x1 && y ==x2)
                visitied[x1][x2] = 0;
            else {

                while (!q.isEmpty()) {
                    int temp[] = q.poll();
                    int dix = temp[0];
                    int diy = temp[1];

                    for (int k = 0; k < 8; k++) {
                        int dixx = dix + dx[k];
                        int diyy = diy + dy[k];

                        if (dixx < 0 || diyy < 0 || dixx >= b || diyy >= b)
                            continue;
                        if (visitied[dixx][diyy] > 0)
                            continue;

                        visitied[dixx][diyy] = visitied[dix][diy] + 1;
                        q.add(new int[]{dixx, diyy});
                    }
                }
            }

            sb.append(visitied[x1][x2]+"\n");
        }
        System.out.println(sb.toString());
    }
}
