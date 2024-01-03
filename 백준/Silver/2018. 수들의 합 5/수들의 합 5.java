import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count =0;
        int total = 0;
        int p,q;

        int i,j;

        int[] array = new int[n+1];

        array[0] = 0;

        for(i=1; i<=n; i++)
            array[i] = i;

        int start_index = 1;
        int end_index = 1;

        while(end_index <=n){
            int sum = 0;

            for(p=start_index; p<=end_index; p++){
                sum += array[p];
            }

            if(sum == n){
                count++;
                end_index++;
            }
            else if(sum < n){
                end_index++;
            }
            else {
                start_index++;
            }
        }

        System.out.println(count);
    }
}