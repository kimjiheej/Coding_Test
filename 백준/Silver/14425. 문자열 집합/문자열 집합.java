import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static boolean isExist(String[] arr, String x){
        int l = 0, r = arr.length-1;

        while(l <= r){
            int m = (l+r) / 2;

        int compareResult =     arr[m].compareTo(x);

        if(compareResult < 0 )
            l = m+1;
        else if(compareResult > 0 )
            r = m-1;
        else
            return true;
        }
        return false;
    }
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        String[] arr = new String[N];

        for(int i=0; i<N; i++)
            arr[i] = sc.next();

        Arrays.sort(arr);

        int count = 0;
        while(M-- > 0){
            String x = sc.next();

            if(isExist(arr,x))
                count++;

        }

        System.out.println(count);

    }



}
