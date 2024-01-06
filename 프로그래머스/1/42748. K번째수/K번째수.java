import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int i,j;
        int start, finish, count;
        int p,q;
        List<Integer>answer = new ArrayList<Integer>();
        
        for(i=0; i<commands.length; i++){
            List<Integer> list = new ArrayList<Integer>();
            start = commands[i][0];
            finish = commands[i][1];
            count = commands[i][2];
            
            for(p=start-1; p<finish; p++){
                list.add(array[p]);
            }
            Collections.sort(list);
            answer.add(list.get(count-1));
        }
        
          int[] result = new int[answer.size()];
        for (i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        
        return result;
    }
}