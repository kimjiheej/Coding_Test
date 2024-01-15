import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());

        int total = 0;
        int total1 = 0;

        st = new StringTokenizer(br.readLine());

        int[] array = new int[num];

        for(int i=0; i<num; i++)
            array[i] = Integer.parseInt(st.nextToken());

        for(int i=0; i<num; i++){


            if(array[i] < 30)
                total +=10;
            else
                total +=(array[i]/30+1) * 10;
        }

        for(int i=0; i<num; i++){


            if(array[i] < 60)
                total1 +=15;
            else
                total1 +=(array[i]/60+1) * 15;
        }

        if(total>total1)
        {
            System.out.println("M " + total1 );
        }
        else if( total < total1){
            System.out.println("Y "+ total);
        }
        else
            System.out.println("Y M "+total);

        }
    }

