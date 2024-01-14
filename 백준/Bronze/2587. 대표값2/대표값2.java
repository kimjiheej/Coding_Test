import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = 0;

        int[] array = new int[5];

        for(int i=0; i<5; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            array[i] = Integer.parseInt(st.nextToken());
            total += array[i];
        }

        Arrays.sort(array);



        System.out.println(total/5);
        System.out.println(array[2]);
    }
}
