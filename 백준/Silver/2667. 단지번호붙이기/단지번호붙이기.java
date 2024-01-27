import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.*;

public class Main {

    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};

    static int visitied[][];

    static int map[][];
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine()); // 7 이다

        map = new int[n][n];
        visitied = new int[n][n];

        for(int i=0; i<n; i++){
           String str  = br.readLine();
            for(int j=0; j<n; j++)
                map[i][j] = Integer.valueOf(str.charAt(j)-'0');
        }

       ArrayList<Integer> arr = new ArrayList<>();

        Queue<int[]> q = new LinkedList<>();

        int count = 0;
        int area = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){

                if(visitied[i][j] > 0 || map[i][j] == 0 )
                    continue;

                visitied[i][j] = 1;
                q.add(new int[] {i,j});
                count++;
                area = 0;

                while(!q.isEmpty()){
                    area++;
                    int temp[] = q.poll();
                    int dix = temp[0];
                    int diy = temp[1];

                    for(int k=0; k<4; k++){
                        int sx = dix + dx[k];
                        int sy = diy + dy[k];

                        if(sx < 0 || sy < 0 || sx >=n || sy>=n)
                            continue;
                        if(map[sx][sy] == 0 || visitied[sx][sy] > 0)
                            continue;

                        q.add(new int[]{sx,sy});
                         visitied[sx][sy] = visitied[dix][diy]+1;

                    }

                }

                arr.add(area);
            }
        }

        System.out.println(count);
        Collections.sort(arr);

        for(int p : arr)
            System.out.println(p);


    }
}
