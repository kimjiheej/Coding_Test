
import java.util.Scanner;
import java.util.*;

public class Main {

    // algo1874
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i, j;

        int array[] = new int[n];

        for (i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int a, b;


        for (i = 0; i < array.length - 1; i++) {
            for (j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    a = array[j];
                    b = array[j + 1];
                    array[j] = b;
                    array[j + 1] = a;
                }
            }
        }

        for(i=0; i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}