import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());


        StringTokenizer st = new StringTokenizer(br.readLine());


        int count = 0;
        boolean check = true;


        int array[] = new int[a];

        for (int i = 0; i < a; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < array.length; i++) {

            check = true;
            if (array[i] == 1)
                continue;
            else if (array[i] == 2) {
                count++;
                continue;
            } else {
                for (int j = 2; j < array[i]; j++) {
                    if (array[i] % j == 0) {
                        check = false;
                        break;
                    }
                }
            }

            if(check)
                count++;

        }

        System.out.println(count);
    }
}
