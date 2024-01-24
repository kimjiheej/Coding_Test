import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] array = new int[100002];
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();
        q.add(a);
        array[a] = 1;

        int total = 0;
        while(!q.isEmpty()){

            int check = q.poll();
            if(check==b){
                System.out.println(array[check]-1);
                return;
            }
            if(check -1 >=0 && check -1 <=100000 && array[check-1] == 0) {
                array[check-1] = array[check]+1;
                q.add(check - 1);
            }
            if(check + 1 >=0 && check +1 <= 100000 && array[check+1]==0) {
                array[check+1] = array[check]+1;
                q.add(check + 1);
            }
            if(check * 2 >=0 && check * 2 <=100000 &&  array[check*2] == 0) {
                array[check*2] = array[check]+1;
                q.add(check * 2);
            }
        }
    }
}
