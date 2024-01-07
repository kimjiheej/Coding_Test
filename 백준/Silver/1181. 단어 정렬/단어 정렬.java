import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N= Integer.parseInt(bf.readLine());

        List<Order> array = new ArrayList<>();

        int i,j;

        // 처음에 받을 때부터 HashSet 으로 만들어버리기
        // HashSet 은 중복을 허용하지 않는다.
        Set<String> uniqueWords = new HashSet<>();
        for(i=0; i<N;i++) {
            String s = bf.readLine();
            uniqueWords.add(s);
        }

        for(String words : uniqueWords){
            array.add(new Order(words.length(),words));
        }

        Collections.sort(array);

        for(i=0; i<array.size();i++)
            System.out.println(array.get(i) +" ");
    }
}
class Order implements Comparable<Order>{

    int length;
    String word;

    public Order(int length, String word ){
        super();
        this.length = length;
        this.word = word;
    }

    @Override
    public String toString() {
        return word;
    }

   @Override
    public int compareTo(Order o){
        int result = this.length - o.length; // 오름 차순 정리
        // 길이가 짧은 것 부터
        if(result == 0){ // 만약 길이가 짧다면
             result = this.word.compareTo(o.word);
        } // 길이가 같으면 사전 순으로
        return result;
    }
}

