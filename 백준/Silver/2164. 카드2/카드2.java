import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();

        for(int i=1; i<=a; i++)
            q.add(i);

        int k = 0;

        while(q.size() > 1) {
            q.poll();
            k = q.poll();
            q.add(k);
        }

        System.out.println(q.peek());


    }
}
