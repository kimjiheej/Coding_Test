import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if(n==0)
            System.out.print(1);
        else {
            long k = fibo(n);


            System.out.println(k);
        }

    }
    public static long fibo(int p){
        if(p==1)
            return 1;
        else
          return  p * fibo(p-1);
    }
}
