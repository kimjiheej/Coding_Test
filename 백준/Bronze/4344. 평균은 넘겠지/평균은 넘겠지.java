import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());

            int[] array = new int[a];

            float total = 0;
            for(int j=0; j<a; j++){
                array[j] = Integer.parseInt(st.nextToken());
                total += array[j];
            }

            // 평균을 계산해주어야 한다

            float avg = total / a;
            int count = 0;

            for(int k=0; k<a; k++){
                if(array[k] > avg)
                    count++;
            }
            float result = ((float)count/a) * 100;

            bw.write(String.format("%.3f",result));
            bw.write("%");
            bw.newLine();
        }

        bw.close();
    }
}
