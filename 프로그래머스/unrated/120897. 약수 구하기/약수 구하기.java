class Solution {
    public int[] solution(int n) {
        
        int count = 0;
        int i;
        for(i=1; i<=n; i++)
            if(n% i ==0)
                count++;
        
        int[] answer = new int[count];
        
        int j;
        int k = 0;
        
        
        for(j=1; j<=n; j++)
            if(n % j ==0)
                answer[k++] = j;
        
        return answer;
    }
}