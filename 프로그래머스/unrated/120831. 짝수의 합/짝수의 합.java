class Solution {
    public int solution(int n) {
     
         int answer = 0;
        
        int i;
        
        if(n==1)
            answer = 0;
        else {
            for(i=2; i<=n; i++)
                if(i % 2 == 0)
                    answer +=i;
        }
        
        return answer;
    }
}