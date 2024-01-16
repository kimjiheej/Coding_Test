import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] array = new int[n];


        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0; i<n ;i++)
            array[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(array);

        int x = Integer.parseInt(br.readLine());

        int start = 0;
        int end = n-1;
        long count = 0;

        while(start < end){
            if(array[start]+array[end]==x)
                count++;
            if(array[start]+array[end] <=x)
                start++;
            else
                end--;
        }

        System.out.println(count);
    }
}
