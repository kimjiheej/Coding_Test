import java.io.*;
import java.sql.Array;
import java.util.StringTokenizer;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = new int[7];
        int total = 0;

       int min = 1000;

        for(int i=0; i<7; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            if (k % 2 != 0) {
                total += k;

                if(k < min)
                    min = k;
            }
        }


        if(min==1000) {
            System.out.println(-1);
        }
        else {
            System.out.println(total);
            System.out.println(min);
        }
    }
}
