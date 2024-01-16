import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int result = a*b*c;

        // 수를 char 으로 만들어 주어야 한다

        String s = String.valueOf(result);

        char[] array = s.toCharArray();

  

        // char 형으로 만들어준 배열을 출력하게 해주어야 한다

        int[] array1 = new int[10];

        for(char g: array)
            array1[g-'0']++;

        for(int q : array1)
            System.out.println(q);
    }
}
