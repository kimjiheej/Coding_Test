import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int a = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int b = Integer.parseInt(stringTokenizer.nextToken());

        int[] array = new int[a];

        int i,j;

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for(i=0; i<array.length; i++){
            array[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int sum = 0;
        int count = 0;

        // i 가 start index 이고 j 가 end index 가 되면 된다
        for(i=0; i<array.length; i++){
            for(j=i+1; j<array.length; j++) {
                sum = 0;
                sum = array[i] + array[j];
                if (sum == b)
                    count++;
            }
        }

        System.out.println(count);
    }
}
