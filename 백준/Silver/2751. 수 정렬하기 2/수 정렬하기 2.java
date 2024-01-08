
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static int[] src;
    public static int[] tmp;

    // algo1874
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(bf.readLine());

        int[] array = new int[n];
        tmp = new int[array.length];
        int i, j;

        List<Integer> array1 = new ArrayList<>();


        for (i = 0; i < array.length; i++) {
            array1.add(Integer.parseInt(bf.readLine()));
        }



       Collections.sort(array1);

        for(int a : array1){
            sb.append(a).append("\n");
        }
        
        System.out.println(sb);
    }
}

