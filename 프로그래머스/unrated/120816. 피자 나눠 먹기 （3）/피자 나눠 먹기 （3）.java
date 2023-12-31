class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        
        int i;
        int k ;
        for(i=1;;i++)
        {
            k = (slice * i)/n;
            if(k==0)
                continue;
            else 
                return i;
        }
    
    }
}