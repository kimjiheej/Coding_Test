import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class Main {

    static int arr[];
    static int array[];

    static int a ;
    static int b;



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        a = Integer.parseInt(br.readLine());

        arr = new int[a];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<a; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        b = Integer.parseInt(br.readLine());

        array = new int[b];

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<b; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<b; i++){
            sb.append((right(array[i]) - left(array[i]))+" ");
        }

        System.out.println(sb.toString());
    }

    public static int right(int k){

        int lo = 0;
        int hi = a;

        while(lo < hi ){

            int middle = (lo + hi )/2;

            if(arr[middle] > k )
                hi = middle;
            else
                lo = middle + 1;
        }

        return lo;
    }

    public static int left(int k){

        int lo = 0;
        int hi = a;

        while(lo < hi){
            int middle = (lo + hi )/2;

            if(arr[middle] >= k)
                hi = middle;
            else
                lo = middle + 1;
        }
        return lo;
    }


}
