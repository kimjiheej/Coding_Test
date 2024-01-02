import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] array = before.toCharArray();
        char[] array1 = after.toCharArray();
 
        // 문자열을 array.sort 로 정렬하고 같으면 1이고 안되면 0 으로 하면 된다 
        int i,j;
        
        Arrays.sort(array);
        Arrays.sort(array1);
        
        String s1 = new String(array);
        String s2 = new String(array1);
        
        if(s1.equals(s2))
            return 1;
        return 0;
    }
}