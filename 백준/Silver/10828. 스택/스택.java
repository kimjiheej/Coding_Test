import java.io.*;
import java.util.Stack;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String a = st.nextToken();

            switch (a) {
                case "push": {
                    int b = Integer.parseInt(st.nextToken());
                    s.push(b);
                    break;
                }
                case "top": {
                    if (!s.isEmpty()) {
                        bw.write(String.valueOf(s.peek()));
                        bw.write("\n");
                    } else {
                        bw.write("-1");
                        bw.write("\n");
                    }
                    break;
                }
                case "size": {
                    bw.write(String.valueOf(s.size()));
                    bw.write("\n");
                    break;
                }
                case "pop": {
                    if (!s.isEmpty()) {
                        bw.write(String.valueOf(s.pop()));
                        bw.write("\n");
                    } else {
                        bw.write("-1");
                        bw.write("\n");
                    }
                    break;
                }
                case "empty": {
                    if (!s.isEmpty()) {
                        bw.write("0");
                        bw.write("\n");
                    } else {
                        bw.write("1");
                        bw.write("\n");
                    }
                    break;
                }

                default:
                    break;

            }
        }

        bw.flush();
    }
}
