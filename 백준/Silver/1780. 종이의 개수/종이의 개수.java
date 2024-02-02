import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static int a =0; // -1 종이의 개수
    public static int b =0; // 0 종이의 개수

    public static int c=0; // 1 종이의 개수

    public static int[][] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new int[n][n];

        StringTokenizer st;

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine(), " ");

            for(int j=0; j<n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        visi(0,0,n);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

    public static void visi(int row, int col, int size){

        if(check(row,col,size))
        {
            if(arr[row][col]==-1) {
                a++;
            }
            else if(arr[row][col]==0) {
                b++;
            }
            else {
                c++;
            }
            return;
        }

        int newSize = size/3;

        visi(row,col,newSize);
        visi(row,col+newSize,newSize);
        visi(row,col+newSize+newSize,newSize);
        visi(row+newSize,col,newSize);
        visi(row+newSize,col+newSize,newSize);
        visi(row+newSize,col+newSize+newSize,newSize);
        visi(row+newSize+newSize,col,newSize);
        visi(row+newSize+newSize,col+newSize,newSize);
        visi(row+newSize+newSize,col+newSize+newSize,newSize);
    }

    static boolean check(int row, int col, int size){

        int c = arr[row][col];

        for(int i=row; i<row+size; i++){
            for(int j=col; j<col+size; j++){
                if(arr[i][j] != c)
                    return false;
            }
        }
        return true;
    }
}
