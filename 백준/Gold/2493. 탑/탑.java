import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;
class Info {
	int height;
	int index;
	Info(int height, int index) {
		this.height = height;
		this.index = index;
	}
}
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int[] arr = new int[N];
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s, " ");
		Stack<Info> top = new Stack<>();
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			while(!top.isEmpty() && top.peek().height < arr[i]) {
				top.pop();
			}
			if(top.isEmpty())
			{
				System.out.print("0 ");
			}
			else
			{
				System.out.print(top.peek().index + " ");
			}
			top.push(new Info(arr[i], i + 1));
		}
	}
}