import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                star(i, j, n);
            }
            sb.append('\n');
        }
        System.out.println(sb);

    }

    public static void star(int i, int j, int n) {
        if ((i / n) % 3 == 1 && (j / n) % 3 == 1) {
            sb.append(' ');
        } else {
            if (n == 1)
                sb.append('*');

            else star(i, j, n / 3);
        }
    }
}
