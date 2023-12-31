class Solution {
    public int solution(int n) {
        int answer = 0;
    
        int total = 0;
        
        int i,j;
        
        
        
        while(n != 0){
            i = n % 10;
            total +=i;
            n /=10;
            
        }
        
        return total;
    }
}