import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] array = new int[3];

        for(int i =0; i<3; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array);

        for(int i : array)
            System.out.print(i+" ");
    }
}
