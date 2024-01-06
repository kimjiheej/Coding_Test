
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;
import java.util.*;

public class Main {

    // algo1874
    // 삽입 정렬로 풀어보기
    public static void main(String[] args) throws IOException {

       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(bf.readLine());

       int n = Integer.parseInt(st.nextToken());

       String s = bf.readLine();


       int[] array = new int[n];

       int i,j;

        StringTokenizer str = new StringTokenizer(s," ");
       for(i=0; i<array.length;i++)
           array[i] = Integer.parseInt(str.nextToken());

       Arrays.sort(array);
       int total = 0;
       int k ;

       for(i=0; i<array.length;i++){
           k = 0;
           for(j=0; j<=i; j++){
               k += array[j];
           }
           total += k;
       }

       System.out.println(total);
    }
}