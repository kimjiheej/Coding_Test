import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());		// 문자열로 받기 때문에 int형으로 형변환
        int X = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];							// 배열 생성

        st = new StringTokenizer(br.readLine()," ");

        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());	// 배열에 수열 A 값을 담아줌
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < X){								// 배열에 있는 수열과 X 값 비교
                bw.write(arr[i] + " ");					// X보다 작은 값 출력
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}