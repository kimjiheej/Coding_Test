import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        ArrayDeque<Integer> q = new ArrayDeque<>();
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            switch(s){
                case "push_back" : {
                    int a = Integer.parseInt(st.nextToken());
                    q.addLast(a);
                    break;

                }
                case "push_front" : {
                    int b = Integer.parseInt(st.nextToken());
                    q.addFirst(b);
                    break;
                }
                case "front" : {
                    if(q.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(q.peekFirst()).append("\n");
                    break;
                }
                case "back" : {
                    if(q.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(q.peekLast()).append("\n");
                    break;
                }
                case "size" : {
                    sb.append(q.size()).append("\n");
                    break;

                }
                case "empty" : {
                    if(q.isEmpty())
                        sb.append(1).append("\n");
                    else
                        sb.append(0).append("\n");
                    break;
                }
                case "pop_front" : {
                    if(q.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(q.pollFirst()).append("\n");
                    break;
                }
                case "pop_back" : {
                    if(q.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(q.pollLast()).append("\n");
                    break;
                }

            }
        }

        System.out.println(sb.toString());
    }
}
