
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // int 받을 때는 이렇게 받기. 숫자의 개수를 받는다

        String s = sc.next();

        char[] array = s.toCharArray();

        int total = 0;
        int i;
        for(i=0; i<array.length; i++){
            total += array[i]-'0';
        }
        System.out.println(total);
    }
}