import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static boolean visitied[][];
    static int map[][];

    static int check[][];

    static int result = 0;

    static int dx[]= {-1,0,1,0};
    static int dy[] = {0,1,0,-1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        map = new int[n][n];
        visitied = new boolean[n][n];
        check = new int[n][n];
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n ;j++)
                map[i][j] = Integer.parseInt(st.nextToken());
        }

        // 일단 여기서 max 를 찾아야 한다

        int max = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(map[i][j] > max)
                    max = map[i][j];
            }
        }


        for(int t = 1; t<=max; t++) {

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    visitied[i][j] = false;
                    check[i][j] = 0;
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (map[i][j] < t)
                        check[i][j] = 0;
                    else
                        check[i][j] = 1;
                }
            }

            int total = 0;
            Queue<int[]> q = new LinkedList<>();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    if (visitied[i][j] == true || check[i][j] == 0)
                        continue;

                    q.add(new int[]{i, j});
                    visitied[i][j] = true;
                    total++;

                    while (!q.isEmpty()) {
                        int[] tmp = q.poll();
                        int x = tmp[0];
                        int y = tmp[1];

                        for (int k = 0; k < 4; k++) {
                            int dix = x + dx[k];
                            int diy = y + dy[k];

                            if (dix < 0 || diy < 0 || dix >= n || diy >= n)
                                continue;
                            if (check[dix][diy] == 0 || visitied[dix][diy] == true)
                                continue;

                            q.add(new int[]{dix, diy});
                            visitied[dix][diy] = true;
                        }
                    }
                }
            }

            arr.add(total);


        }

        Collections.sort(arr);
        System.out.println(arr.get(arr.size()-1));
    }
}
