
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int count = 0;

        ArrayList<String> lines = new ArrayList<>();
        String line = br.readLine();

        while(!line.equals(".")){
            lines.add(line);
            line = br.readLine();
        }


        // 일단 스택에서 문자열의 길이만큼 반복문을 해준다
        for(int i=0; i<lines.size(); i++){
            // 괄호일때에만 스택에 넣어준다
            Stack<String> ss = new Stack<>();

            char[] q = lines.get(i).toCharArray(); // 라인에서 한줄 가져와서 char 배열 만들어주기

            ArrayList<String> change = new ArrayList<>(); // 스택만 있음

            for(int j=0; j<q.length; j++){
                if(q[j] == '[' || q[j] == ']' || q[j]==')' || q[j]=='(')
                    change.add(String.valueOf(q[j]));
            }

            // change 에 ( ) 이런게 하나씩 들어있는 것이다
            boolean valid = true;

            count = change.size();

            int v = 0;
            while(v<count){
                if(change.get(v).equals("["))
                    ss.push("[");
                else if(change.get(v).equals("("))
                    ss.push("(");
                else if(change.get(v).equals(")")) {
                    if (ss.isEmpty()) {
                        valid = false;
                        break;
                    }
                    else {
                        String s1 = ss.peek();
                        if (s1.equals("("))
                            ss.pop();
                        else
                            break;
                    }
                }
                else if(change.get(v).equals("]")) {
                    if (ss.isEmpty()) {
                        valid = false;
                        break;
                    }
                    else {
                        String s2 = ss.peek();
                        if (s2.equals("["))
                            ss.pop();
                        else
                            break;
                    }
                }
                v++;
            }

            if(ss.isEmpty() && valid==true)
                sb.append("yes\n");
            else
                sb.append("no\n");
        }
        // 왼쪽 괄호가 들어오면 스택에 넣어준다
        // 오른쪽 괄호가 들어오면 왼쪽 괄호와 비교해서 같으면 왼쪽 pop
        // 다르면잘못된 것이다

        System.out.println(sb.toString());
    }
}
