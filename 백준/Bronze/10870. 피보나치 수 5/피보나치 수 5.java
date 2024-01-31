import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int q = fibo(n);

        System.out.println(q);
    }

    static int fibo(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;

        return fibo(n-1)+fibo(n-2);
    }
}
