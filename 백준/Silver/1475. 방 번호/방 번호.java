import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N = br.readLine();
        int[] count = new int[10];
        Arrays.fill(count, 0);

        for (int i = 0; i < N.length(); i++) {
            int number = Integer.parseInt(String.valueOf(N.charAt(i)));

            if (number == 9)
                count[6]++;
            else
                count[number]++;
        }

        if(count[6] % 2 == 1)
            count[6] = count[6]/2+1;
            else
                count[6] = count[6]/2;

        int max = 0;

        for(int i = 0 ; i < count.length ; i++) {
            max = Math.max(max, count[i]);
        }

      System.out.println(max);


    }
    }



