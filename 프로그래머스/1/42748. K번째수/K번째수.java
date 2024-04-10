import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
            
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<commands.length; i++){
            int start = commands[i][0];
            int end = commands[i][1];
            int order = commands[i][2];
            
            ArrayList<Integer> arr = new ArrayList<>();
            
            for(int j = start-1; j<=end-1; j++){
                arr.add(array[j]);
            }
            
            Collections.sort(arr);
            answer.add(arr.get(order-1));
        }
        
        int[] ans = new int[answer.size()];
        
        int size = 0;
        for(int k : answer){
            ans[size++] = k;
        }
        
        
        return ans;
    }
}