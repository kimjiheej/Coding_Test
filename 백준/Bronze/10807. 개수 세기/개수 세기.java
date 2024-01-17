import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        int[] array = new int[a];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<a; i++)
        {
            array[i] = Integer.parseInt(st.nextToken());
        }

        int total = 0;

        int b = Integer.parseInt(br.readLine());

        for(int i=0; i<a; i++)
            if(array[i]==b)
                total++;

        System.out.println(total);


    }
}
