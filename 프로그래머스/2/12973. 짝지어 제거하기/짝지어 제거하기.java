import java.util.*;
// stack 을 활용하면 된다 !! 
class Solution
{
    public int solution(String s)
    {
       
        int answer = 0;
        
        int length = s.length();
        
        char[] arr = s.toCharArray();
        
        Stack<Character> stack = new Stack<>();
        stack.push(arr[0]);
        for(int i=1; i<length; i++){
            if(!stack.isEmpty() && arr[i] == stack.peek())
                stack.pop();
            else 
                stack.push(arr[i]);
        }
        
        if(stack.isEmpty())
            return 1;
        return 0;
    }
}