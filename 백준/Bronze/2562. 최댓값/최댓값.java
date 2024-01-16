import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int max = 0;
        int index = 0;

        int[] array = new int[9];

        for(int i =0; i<9; i++)
            array[i] = Integer.parseInt(br.readLine());



        for(int i=0; i<9; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }

        System.out.println(max);
        System.out.println(index+1);

    }
}
