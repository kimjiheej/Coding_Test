import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s= br.readLine();

        int[] array = new int[26]; // 몇번 들어가는지 보는

        // a 를 0 으로 b 를 1으로 해준다

        char[] array1 = s.toCharArray();

        for(char c : array1){
            array[c-'a']++;
        }

        for(int i : array){
            System.out.print(i+" ");
        }
    }
}
