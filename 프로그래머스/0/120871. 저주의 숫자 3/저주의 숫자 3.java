import java.util.*;

class Solution {
    public int solution(int n) {
        
        int[] array = new int[100];
        
        int cnt = 1;
        
        for(int i=1; i<=n; i++){
            String s = String.valueOf(cnt);
            if((cnt % 3) != 0) && (!s.contains('3'))){
                array[i] = cnt;
            }
            cnt++;   
        }
    
        return array[n];
    }
