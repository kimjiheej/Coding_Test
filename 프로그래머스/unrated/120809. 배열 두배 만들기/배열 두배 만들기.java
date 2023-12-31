class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        
        
        int i,j;
        j = 0;
        
        for(i=0; i<numbers.length; i++)
            answer[j++] = numbers[i] * 2;
        return answer;
    }
}