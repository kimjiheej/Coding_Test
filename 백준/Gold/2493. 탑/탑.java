import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n  = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] array = new int[n];
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < n; i++){
            while (!stack.isEmpty()) {
                if (array[stack.peek()] < array[i]) {
                    stack.pop();
                } else {
                    answer[i] = stack.peek() + 1;
                    break;
                }
            }

            stack.push(i);
        }

        for(int i = 0; i < n; i++){
            sb.append(answer[i]).append(" ");
        }

        System.out.println(sb.toString());
    }
}