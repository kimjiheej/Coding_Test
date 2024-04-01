import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int answer = 0;

        int[] countA = new int[26]; // dared [1,0,0,2 ..]
        int[] countB = new int[26];

        for(int i=0; i<a.length(); i++){
            countA[a.charAt(i)-'a']++;
        }

        for(int i=0; i<b.length(); i++){
            countB[b.charAt(i)-'a']++;
        }

        for(int i=0; i<countA.length; i++){
            if(countA[i] != countB[i]){
                answer += Math.abs(countA[i] - countB[i]);
            }
        }

        System.out.println(answer);
    }
}
