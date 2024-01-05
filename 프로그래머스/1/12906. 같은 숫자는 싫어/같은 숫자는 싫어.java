import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
       
        Stack<Integer> s = new Stack<>();
        StringBuffer bf = new StringBuffer();
        int i;
        for(i=arr.length-1; i>=0; i--)
            s.push(arr[i]);
        
       int first = 1;
       int compare = 0;
        
       int a,b;
        int check = 0;
        
        compare = s.pop();
        bf.append(compare);
        while(!s.isEmpty()){

           if(compare == s.peek())
           {
               compare = s.pop();
           }
            else {
                compare = s.pop();
                bf.append(compare);
            }
       }
        
      
        
        char[] answer = bf.toString().toCharArray();
        int[] array1 = new int[answer.length];
        for(i=0; i<answer.length; i++){
            array1[i] = Integer.parseInt(String.valueOf(answer[i]));
        }
        return array1;
    }
}