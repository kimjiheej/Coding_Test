
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.*;

public class Main {

    // algo11004
    public static void main(String[] args) throws IOException {


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int a,b;

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        int[] array = new int[a];

        int i,j;


        st = new StringTokenizer(bf.readLine());
        for(i=0; i<a; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(array);

        System.out.println(array[b-1]);
    }
}