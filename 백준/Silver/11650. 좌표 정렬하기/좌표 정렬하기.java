
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

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;

      int n = Integer.parseInt(br.readLine());

      int[][] array = new int[n][2];

      List<ArrayList> array1 = new ArrayList<>();
      int i,j;

      for(i=0; i<n ;i++){

          st = new StringTokenizer(br.readLine());

          array[i][0] = Integer.parseInt(st.nextToken());
          array[i][1] = Integer.parseInt(st.nextToken());


      }

      Arrays.sort(array, new Comparator<int[]>(){
          @Override
          public int compare(int[] o1, int[] o2) {
             if(o1[0] == o2[0]) // x 좌표가 같으면
                 return o1[1] - o2[1];
             else
                 return o1[0] - o2[0];
          }
        });

     for(i=0; i<n; i++){
         for(j=0; j<2; j++)
             System.out.print(array[i][j] +" ");
         System.out.print("\n");
     }

    }


}


