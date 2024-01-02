import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        n = sc.nextInt();
        int[] array = new int[n];
        int i;

        for(i=0; i<n; i++){
            array[i] = sc.nextInt();
        }

        int max = 0;

        for(i=0; i<array.length; i++){
            if(array[i] > max)
                max = array[i];
        }

        long answer = 0;

        for(i=0; i<array.length; i++){
            answer += array[i];
        }

        System.out.println(answer * 100.0 /max/n);
    }
}
