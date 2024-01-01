class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 나머지가 0 이면 되는 것이다 
        
        int i=6; 
        
        int j;
        
        for(j=1;; j++)
        {
            if(i*j % n ==0)
                return j;
        
        }
    
    }
}