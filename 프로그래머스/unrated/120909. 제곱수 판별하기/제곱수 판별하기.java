class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int i;
        int k = 1;
        for(i=1;; i++)
        {
            k = i*i;
            
            if(n == k)
                return 1;
            else if(k > n)
                return 2;
            else 
                continue;
        }
    
    }
}