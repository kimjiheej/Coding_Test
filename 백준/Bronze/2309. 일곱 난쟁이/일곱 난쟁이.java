import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[9];
        int[] array1 = new int[7]; // 여기에다가 저장해주자
        int total = 0;
        int a = 0;
        int b = 0;

        for(int i=0; i<9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            array[i] = Integer.parseInt(st.nextToken());
            total += array[i];
        }

        for(int i=0; i<8; i++){
            for(int j=i+1; j<9; j++)
                if(total - array[i]-array[j] == 100)
                {
                     a = array[i];
                     b = array[j];
                }
        }

        int k = 0;
        for(int i=0; i<9; i++) {
            if(array[i] == a || array[i] == b)
                continue;
            array1[k++] = array[i];
        }

        Arrays.sort(array1);

        for(int i=0; i<7; i++)
            System.out.println(array1[i]);
    }
}
