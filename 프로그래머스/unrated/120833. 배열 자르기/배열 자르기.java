class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int k = (num2-num1) + 1;
        int[] answer = new int[k];
        
        int i,j;
        
        j = 0;
        for(i=num1; i<=num2; i++)
            answer[j++] = numbers[i];
        
        return answer;
    }
}