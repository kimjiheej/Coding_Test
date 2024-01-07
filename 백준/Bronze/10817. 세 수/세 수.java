
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.*;

import java.util.*;

public class Main {

    // algo1874
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int[] array = new int[3];

        int i,j;

        for(i=0; i<array.length;i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        
        Integer[] tmp = Arrays.stream(array).boxed().toArray(Integer[]::new);
        Arrays.sort(tmp,Collections.reverseOrder());

        System.out.println(tmp[1]);
    }

}
