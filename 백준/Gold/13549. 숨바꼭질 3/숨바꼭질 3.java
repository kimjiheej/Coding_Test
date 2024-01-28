import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.*;


public class Main {

    static int map[] = new int[100001];
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken()); // 수빈이가 있는 위치이다
        int b = Integer.parseInt(st.nextToken()); // 동생이 있는 위치이다

        Queue<Integer> q = new LinkedList<>();

        q.add(a); // 수빈이의 위치를 넣는다
        map[a] = 1;

        while(!q.isEmpty()){
            int check = q.poll();
            if(check == b)
            {
                System.out.print(map[check]-1);
                return;
            }

            if((check *2 >=0) && (check * 2 <=100000) && map[check*2] == 0){

                q.add(check*2);
                map[check*2] = map[check];
            }
            if((check-1 >= 0) && (check -1 <= 100000) && (map[check-1]==0)){
                q.add(check-1);
                map[check-1] = map[check]+1;
            }
            if((check+1 >=0) && (check+1 <= 100000) && (map[check+1] ==0)){
                q.add(check+1);
                map[check+1] = map[check]+1;
            }

        }
    }
}
