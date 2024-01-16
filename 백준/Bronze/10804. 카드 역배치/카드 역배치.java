import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int array[] = new int[21];

        for(int i=1; i<array.length; i++)
            array[i] = i;



        for(int i=0; i<10; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int count = b-a+1; // 개수이다

            int array1[] = new int[count];

           int total = 0;

           for(int k = a; k<=b; k++)
               array1[total++] = array[k];

            for(int j = 1; j<=array1.length; j++)
                array[a++] = array1[array1.length-j];
        }

       for(int i = 1; i<21; i++)
           System.out.print(array[i]+" ");

    }
}
