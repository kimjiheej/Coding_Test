import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());


        System.out.print(remainder(a,b,c));
    }

    public static long remainder(long a, long b, long c){

        if(b==1){
            return a % c;
        }
        else {
            long halfVal = remainder(a,b/2,c);
            // 지수가 홀수 일때
            if(b % 2 == 1){
                return (halfVal * halfVal % c) * a % c;
            }

            return halfVal * halfVal % c;
        }
    }

}
