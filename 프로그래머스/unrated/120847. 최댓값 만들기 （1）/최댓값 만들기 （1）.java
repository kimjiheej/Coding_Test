class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max, max1;
        max = -1;
        max1 = -1;
        int i;
        int j;
        int p =0;
        
        for(i=0; i<numbers.length; i++)
        {
            if(numbers[i] > max){
                max = numbers[i];
                p = i;
            }
        }
        
        for(j=0; j<numbers.length; j++){
            if(j == p)
                continue;
            if(numbers[j] > max1 )
                max1 = numbers[j];
        }
        
        answer= max * max1;
        return answer;
    }
}