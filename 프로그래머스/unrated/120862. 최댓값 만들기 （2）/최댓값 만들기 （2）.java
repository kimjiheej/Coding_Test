import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        
        int num1 = numbers[numbers.length-1] * numbers[numbers.length-2];
        int num2 = numbers[0] * numbers[1];
        
        if(num1 > num2) 
            answer = num1;
        else 
            answer = num2;
        return answer;
    }
}