import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {


    static int[] arr;


    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int lo = 1; // 최소 거리가 가질 수 있는 최솟값이다.
        int hi = arr[N-1] - arr[0] + 1; // 최소 거리가 가질 수 있는 최댓값이다.

        while(lo < hi){

            int mid = (lo + hi) / 2;

            if(calculate(mid) < M)
            {
                hi = mid;
            }
            else {
                lo = mid + 1;
            }
        }

        System.out.println(lo-1);


    }

    public static int calculate(int d){
        int count = 1;
        int a = arr[0];

        for(int i=1; i<arr.length; i++){

            int k = arr[i];

            if(k - a >= d){
                count++;
                a = k;
            }
        }
        return count;
    }
}
