import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        long result = c - b; // destination
        long cal = a - b; // dist

        long a1 = result / cal;
        long b1 = result % cal;

        int count = 0;
        if(b1 != 0)
        {
            System.out.println(a1+1);
        }
        else
        {
            System.out.println(a1);
        }
    }
}
