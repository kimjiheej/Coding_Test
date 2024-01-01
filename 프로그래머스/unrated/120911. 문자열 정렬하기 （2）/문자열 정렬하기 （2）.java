import java.util.*;
class Solution {
    public String solution(String my_string) {
   
        
        String answer = my_string.toLowerCase();
        
        char[] array = answer.toCharArray();
        Arrays.sort(array);
        
        return new String(array); // 정렬
    }
}