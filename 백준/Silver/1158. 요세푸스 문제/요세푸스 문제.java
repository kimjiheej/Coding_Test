import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken()); // 개수
        int b = Integer.parseInt(st.nextToken()); // rotation 의 횟수

        LinkedList<Integer> list = new LinkedList<>();

        for(int i=1; i<=a; i++)
            list.add(i);

        bw.write("<");
        while(!list.isEmpty()){
            for(int i = 0; i<b; i++){
                if(i != b-1){
                    list.add(list.remove(0));
                }
                else {
                    if(list.size() == 1){
                        bw.write(String.valueOf(list.get(0)));
                    } else {
                        bw.write(String.valueOf(list.get(0) + ", "));
                    }
                    
                    list.remove(0);
                }
            }
        }
        bw.write(">");
        
        br.close();
        bw.flush();
        bw.close();



    }


}
