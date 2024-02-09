import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken()); // 제곱의 수
        int b = Integer.parseInt(st.nextToken()); // r 행
        int c = Integer.parseInt(st.nextToken()); // c 행

        int miro = check(a, b, c);

        System.out.println(miro);
    }

    public static int check(int n, int r, int c) {

        if (n == 0) {
            return 0;
        }

        int half = 1 << (n - 1); // 제곱 계산을 비트 연산으로 변경

        // 1 사분면에 있을 때
        if (r < half && c < half)
            return check(n - 1, r, c);

        if (r < half && c >= half) // 2사분면
            return half * half + check(n - 1, r, c-half);

        if (r >= half && c < half) // 3번
            return 2 * half * half + check(n - 1, r-half, c);

        // (b >= half && c >= half)인 경우
        return 3 * half * half + check(n - 1, r - half, c - half);
    }
}

