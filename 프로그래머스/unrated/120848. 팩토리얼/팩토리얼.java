class Solution {
    public int solution(int n) {
        int answer = 0;
        int k;
        int i;
        int j;
        for(i=1;; i++){
            k = 1;
            for(j = 1; j<=i; j++)
            {
                k*=j;
            }
            
            if(k>n)
                return i-1;
        }
    }
}