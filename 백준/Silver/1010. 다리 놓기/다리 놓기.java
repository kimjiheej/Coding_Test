

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <=T; test_case++){
            st = new StringTokenizer(br.readLine()+" ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            dp = new int[M+1][N+1];
            sb.append(combination(M,N) + "\n");
        }
        System.out.println(sb);

    }

    static int combination(int n, int r){
        if(dp[n][r] > 0 ){
            return dp[n][r];
        }

        if(r==0 || n==r){
            return dp[n][r] = 1;
        }

        return dp[n][r] = combination(n-1,r-1) + combination(n-1,r);
    }
}
