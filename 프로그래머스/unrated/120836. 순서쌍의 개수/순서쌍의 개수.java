class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 약수의 개수 구하기 
        
        int i;
        int j;
        int total = 0;
        
        for(i=1; i<=n; i++)
            if(n % i ==0)
                total ++;
        
        return total;
    }
}