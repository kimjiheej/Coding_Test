import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static char arr[][];


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        arr = new char[n][n];
        for(int i=0; i<n; i++){
            String s  = br.readLine();

            for(int j=0; j<n; j++){
               arr[i][j] = s.charAt(j);
            }
        }

        visi(0,0,n);

    }

    public static void visi(int row, int col, int size){


        if(check(row,col,size)){

            if(arr[row][col]=='0')
                System.out.print('0');
            else
                System.out.print('1');


            return;

        }



        int halfSize = size/2;

        System.out.print('(');

        visi(row,col,halfSize);
        visi(row,col+halfSize,halfSize);
        visi(row+halfSize,col,halfSize);
        visi(row+halfSize,col+halfSize,halfSize);

        System.out.print(')');

    }

    public static boolean check(int row, int col, int size){

        char c = arr[row][col];

        for(int i=row; i<row+size; i++)
        {
            for(int j=col; j<col+size; j++){
                if(arr[i][j] != c)
                    return false;
            }
        }
        return true;
    }
}
