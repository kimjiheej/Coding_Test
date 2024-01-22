import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            String s = br.readLine();

            boolean valid = true;
            char[] array = s.toCharArray();

            Stack<String> st = new Stack<>();

            for(int j=0; j<array.length;j++){
                if(array[j] == '(')
                    st.push(String.valueOf(array[j]));
                else if(array[j] == ')')
                {
                    if(!st.isEmpty() && st.peek().equals("("))
                        st.pop();
                    else {
                        valid = false;
                        break;
                    }
                }
            }

            if(st.isEmpty() && valid == true)
                sb.append("YES\n");
            else
                sb.append("NO\n");
        }
        System.out.println(sb.toString());
    }
}
