
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.*;

public class Main {

    // algo1874
    public static void main(String[] args) throws IOException {

        // 들어오는 게 많으면 이렇게 사용한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> MyQueue = new PriorityQueue<>((o1,o2)->{
            // 절댓값 작은 데이터 먼저
            // 절댓값 같은 경우 음수 우선


            //절댓값 작은 데이터 우선
            int first_abs = Math.abs(o1);
            int second_Abs = Math.abs(o2);
            if(first_abs == second_Abs)
                return o1 > o2 ? 1: -1;
            return first_abs - second_Abs;
        });

        for(int i=0; i<N; i++){
            int request = Integer.parseInt(br.readLine());
            if(request == 0){
                if(MyQueue.isEmpty()){
                    System.out.println("0");
                }else {
                    System.out.println(MyQueue.poll());
                }
                }else {
                MyQueue.add(request);
            }
        }
    }
}
