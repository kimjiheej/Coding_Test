import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());

        if(a % 4 == 0 && a % 100 != 0)
            System.out.println(1);
        else if(a % 400 == 0)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
