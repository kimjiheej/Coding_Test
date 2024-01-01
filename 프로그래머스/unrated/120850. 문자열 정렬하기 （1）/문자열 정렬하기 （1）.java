import java.util.*;
class Solution {
    public int[] solution(String my_string) {
     
      my_string = my_string.replaceAll("[a-z]","");
        
      String[] array = my_string.split("");
      int[] answer = new int[array.length];
        
      int i;
        
        for(i=0; i<array.length; i++){
            answer[i] = Integer.parseInt(array[i]);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}