import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int k = Integer.parseInt(br.readLine());

        int[] arr1 = new int[k];

        st = new StringTokenizer(br.readLine());

        for(int j=0; j<k; j++){
            arr1[j] = Integer.parseInt(st.nextToken());
        }

        for(int j=0; j<k; j++){

            int left = 0;
            int right = arr.length-1;
            int check = arr1[j];

            while(left <= right){
                int middle = (left+right)/2;

                if(arr[middle] < check)
                    left = middle + 1;
                else if(arr[middle] > check)
                    right = middle -1;
                else if(arr[middle] == check){
                    bw.write(1+"\n");
                    break;
                }
            }
            if(left > right)
                bw.write(0+"\n");
        }

        bw.flush();
        bw.close();
    }
}