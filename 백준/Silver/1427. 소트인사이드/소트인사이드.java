
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.*;

public class Main {

    // algo1874
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = bf.readLine();

        char[] array = str.toCharArray();

        int[] array1 = new int[array.length];

        int i,j;
        int index;
        int max;

        for(i=0; i<array.length; i++) {
            array1[i] = Integer.parseInt(String.valueOf(array[i]));
        }

       boolean check;

        for(i=0; i<array.length-1; i++) {
            max = 0;
            index = 0;
            check = false;
            for (j = i; j < array.length; j++) {
                if (array1[j] > max) {
                    max = array1[j];
                    index = j;
                    check = true;
                }
            }
            if (check == true) {
                int temp = max;
                array1[index] = array1[i];
                array1[i] = temp;
            }
        }

        for(i=0; i<array.length; i++)
            System.out.print(array1[i]);
    }
}