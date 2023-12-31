import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer;
        
        if(n% 2 ==0)
            answer = new int[n/2];
        else 
            answer = new int[n/2+1];
        
        int i;
        int j = 0;
        
        for(i=1; i<=n; i++)
        {
            if(i % 2 ==0)
                continue;
            else 
               answer[j++] = i;
        }
        
        return answer;
    }
}