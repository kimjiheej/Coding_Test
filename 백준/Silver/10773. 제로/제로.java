import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> s = new Stack<>();

        for(int i=0; i<n; i++){

            int b = Integer.parseInt(br.readLine());

            if(b != 0)
                s.push(b);
            else
                s.pop();

        }

        int total = 0;

        while(!s.isEmpty())
            total += s.pop();

        System.out.println(total);
    }
}
