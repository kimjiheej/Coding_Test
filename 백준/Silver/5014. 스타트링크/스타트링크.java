import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.*;
public class Main {


    static int map[];





    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int size = Integer.parseInt(st.nextToken()); // 총 몇층
        int gsize = Integer.parseInt(st.nextToken()); // 강호의 층
        int goal = Integer.parseInt(st.nextToken()); // 강호의 목표 층
        int u = Integer.parseInt(st.nextToken()); // 몇칸 위로 갈 수 있는지
        int d = Integer.parseInt(st.nextToken()); // 몇칸 아래로 갈 수 있니

        map = new int[size+1]; // 층을 만들었다


        Queue<Integer> q = new LinkedList<>();
        q.add(gsize); // 강호의 현재 층을 넣어준다.
        map[gsize] = 1;


        while(!q.isEmpty()){
            int check = q.poll();
            if(check == goal)
            {
                System.out.print(map[goal]-1);
                return;
            }

            if ((check + u <= size) && (check + u > 0) && (map[check + u] == 0)) {
                q.add(check + u);
                map[check + u] = map[check] + 1;
            }

            if ((check - d <= size) && (check - d > 0) && (map[check - d] == 0)) {
                q.add(check - d);
                map[check - d] = map[check] + 1;
            }
        }
        System.out.print("use the stairs");
    }
}
