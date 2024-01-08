
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.*;

public class Main {

    // algo1874
    public static void main(String[] args) throws IOException {

        // 들어오는 게 많으면 이렇게 사용한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        ArrayList<Order> array = new ArrayList<>();

        int i,j;

        for(i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            array.add(new Order(a,i,s));
        }

        Collections.sort(array);

        for(i=0; i<array.size(); i++)
            System.out.println(array.get(i));
    }
}
class Order implements Comparable<Order>{
    int age;
    int index;

    String name;

    public Order(int age,int index, String name) {
        super();
        this.age = age;
        this.index = index;
        this.name = name;
    }

    @Override
    public String toString(){
        return age + " "+ name;
    }

    @Override
    public int compareTo(Order o){

        int result;
        result = this.age - o.age;

        if(result == 0)
            result = this.index - o.index;
        return result;
    }
}

