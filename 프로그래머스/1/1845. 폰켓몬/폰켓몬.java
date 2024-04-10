import java.util.*;
class Solution {
    public int solution(int[] nums) {
   
        // 중복을 허용하지 않는 set 을 사용하면 되겠다 !! 
        HashSet<Integer> s = new HashSet<>();
        
        for(int i : nums){
            s.add(i);
        }
        
        int k = nums.length;
        
        if(s.size() <= k/2)
            return s.size();
        else 
            return k/2;
        
    }
}