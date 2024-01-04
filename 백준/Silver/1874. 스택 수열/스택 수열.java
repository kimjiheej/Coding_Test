
import java.util.Scanner;
import java.util.*;

public class Main {

    // algo1874
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder bf = new StringBuilder();
        int n;
        int num = 1;
        int k;
        n = sc.nextInt();
        int a[] = new int[n];
        int i, j;
        boolean check = true;

        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>(); // 중요하다 스택 만들기

        for (j = 0; j < n; j++) {
            if (a[j] >= num) {
                while (a[j] >=num) {
                    stack.push(num++);
                    bf.append("+\n");

                }
                stack.pop();
                bf.append("-\n");
            } else {
                int p = stack.pop();
                   if(p > a[j]) {
                       System.out.println("NO");
                       check = false;
                       break;
                   }else {
                       bf.append("-\n"); // 마지막에 다 빼주기
                    }
            }
        }
        if(check)
        System.out.println(bf.toString());

    }
}