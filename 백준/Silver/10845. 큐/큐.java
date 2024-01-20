import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();

        int p = 0;

        for(int i=0; i<n; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String s = st.nextToken();

            switch(s){
                case "push":
                {
                    int k = Integer.parseInt(st.nextToken());
                    q.add(k);
                    p = k;
                    break;
                }
                case "front" :
                {
                    if(q.isEmpty())
                        sb.append("-1\n");
                    else
                    sb.append(q.peek()+"\n");
                    break;
                }
                case "back" :
                {
                    if(q.isEmpty())
                        sb.append("-1\n");
                    else
                       sb.append(p+"\n");
                    break;
                    }
                case "pop" :
                {
                    if(q.isEmpty())
                       sb.append("-1\n");
                    else
                    {
                        sb.append(q.peek()+"\n");
                        q.poll();
                    }
                    break;
                }
                case "size" : {
                    sb.append(q.size()+"\n");
                    break;
                }
                case "empty" : {
                    if(q.isEmpty())
                        sb.append(1+"\n");
                    else
                        sb.append(0+"\n");
                    break;
                }


            }
        }
       System.out.println(sb.toString());
    }

}
