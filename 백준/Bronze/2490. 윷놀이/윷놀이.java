import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < 3; i++) {
            int[] array = new int[2];
           StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                int k = Integer.parseInt(st.nextToken());
                if (k == 0)
                    array[0]++;
                else
                    array[1]++;
            }
            if(array[0]==1 && array[1] == 3)
               sb.append('A'+"\n"); // 도
            else if(array[1] ==2 && array[0]==2)
                sb.append('B'+"\n"); // 개
            else if(array[0] == 3 && array[1]==1)
                sb.append('C'+"\n");
            else if(array[0] == 4)
                sb.append('D'+"\n");
            else if(array[1]==4)
                sb.append('E'+"\n");
        }

        System.out.println(sb.toString());
        }
    }

