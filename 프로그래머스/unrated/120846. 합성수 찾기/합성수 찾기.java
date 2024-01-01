class Solution {
    public int solution(int n) {
        int answer = 0;
        int a;
        int i,j;
        
        for(i=1; i<=n; i++)
        {
            a=0;
            
            for(j=1; j<=n; j++)
                if(i % j ==0){
                    a++;
                }
                    
            if(a>=3)
                answer++;
        }
        return answer;
    }
}