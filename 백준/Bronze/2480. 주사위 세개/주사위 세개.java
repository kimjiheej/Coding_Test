import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int answer = 0;
        int[] array = new int[3];

        for(int i=0; i<3; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        int[] array1 = new int[7]; // 몇개가 나왔는지 체크하는 배열이다

        for(int i=0; i<3; i++){
            int k = array[i];
            array1[k]++;
        }

   


        for(int i=1; i<array1.length;i++){
            if(array1[i] ==3){
                answer = 10000 + i * 1000;
                break;
            }
            else if(array1[i] == 2){
                answer = 1000 + i * 100;
                break;
            }
        }

        int max = 0;
        for(int i=0; i<3; i++)
            if(max < array[i])
                max = array[i];

        if(answer == 0)
            answer = max * 100;

        System.out.println(answer);
    }
}
