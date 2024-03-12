import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int count = 0;
        
        for(int i=0; i<commands.length; i++){
                int first = commands[i][0] -1;
                int second = commands[i][1] -1;
                int stop = commands[i][2];
                
            ArrayList<Integer> ans = new ArrayList<Integer>();
            
                for(int j = first; j<=second; j++){
                    ans.add(array[j]);
                }
            
            Collections.sort(ans);
            answer[count++]  = ans.get(stop-1);
            }
          return answer;
        }
      
    }
