import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    static boolean[] visited;
    static int[] array;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int count = 0;

        visited = new boolean[num + 1];
        array = new int[num + 1];

        for (int i = 1; i <= num; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (!visited[i]) {
                ArrayList<Integer> cycle = findCycle(i);
                if (cycle != null) {
                    arr.addAll(cycle);
                    count += cycle.size();
                }
            }
        }

        Collections.sort(arr);

        System.out.println(count);

        for (int value : arr) {
            System.out.println(value);
        }
    }

    static ArrayList<Integer> findCycle(int start) {
        ArrayList<Integer> cycle = new ArrayList<>();
        int current = start;

        while (!visited[current]) {
            visited[current] = true;
            cycle.add(current);
            current = array[current];
        }

        int index = cycle.indexOf(current);
        if (index != -1) {
            return new ArrayList<>(cycle.subList(index, cycle.size()));
        } else {
            return null;
        }
    }
}