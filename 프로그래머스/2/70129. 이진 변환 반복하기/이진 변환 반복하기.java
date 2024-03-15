import java.util.*;
class Solution {
    public int[] solution(String s) {
      
        String answer = s;
        int count = 0; // 0 을 지운 횟수 
        int ans = 0; // 몇 번의 이진 변환을 했냐를 구하는 것
        
        
        while(!answer.equals("1")){
            char[] arr = answer.toCharArray();
            answer="";
            for(int i=0; i<arr.length; i++){
                if(arr[i]!='0'){
                    answer += String.valueOf(arr[i]);
            }
                else 
                    count++;
            }
            
            int length = answer.length(); // string 의 길이이다. 
             ans++;
             answer = Integer.toBinaryString(length);
            
        }
        
        int[] total = new int[2];
        total[0] = ans;
        total[1] = count;   
        
        return total;
    }
}