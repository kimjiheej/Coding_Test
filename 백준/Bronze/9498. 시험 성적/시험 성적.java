import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(a>=90)
            System.out.println('A');
        else if( a>=80 && a<=89)
            System.out.println('B');
        else if(a>=70 && a<=79)
            System.out.println('C');
        else if(a>=60 && a<=69)
            System.out.println('D');
        else
            System.out.println('F');
    }
}
