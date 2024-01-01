class Solution {
    public int solution(int hp) {
        int answer = 0;
        int total = 0;
        
        int i,j;
        
        i = hp / 5;
        j = hp % 5;
        total +=i;
        
        if(j==0)
            return total;
        
        i = j / 3;
        j = j % 3;
        total +=i;
        
        if(j==0)
            return total;
        
        i = j / 1;
        j = j % 1;
        total +=i;
        
        return total;
    }
}