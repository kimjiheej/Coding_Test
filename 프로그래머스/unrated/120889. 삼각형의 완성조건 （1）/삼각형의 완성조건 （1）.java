class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int max = 0;
        
        int i;
        
        int k = 0;
        
        int total = 0;
        
        
        for(i=0; i<sides.length; i++){
            if(sides[i] > max){
                max = sides[i];
                k = i;
            }
        }
        
        int j;
        
        for(j=0; j<sides.length; j++)
        {
            if(j==k)
                continue;
            else 
                total +=sides[j];
        }
        
        if(max < total)
            return 1;
        else 
            return 2;
    
    }
}