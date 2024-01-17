import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int[] a_count = get_alphabet_count(a);
        int[] b_count = get_alphabet_count(b);

        int ans = 0;

        for(int i=0; i<26; i++){
            ans +=Math.abs(a_count[i] - b_count[i]);
        }

        System.out.println(ans);
    }

    public static int[] get_alphabet_count(String str){
        int[] count = new int[26];

        for(int i=0; i<str.length();i++){
            count[str.charAt(i)-'a']++;
        }
        return count;
    }
}
