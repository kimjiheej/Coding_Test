class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        
        int i,j;
        
        for(i=0; i<strlist.length; i++)
        {
            answer[i] = strlist[i].length();
        }
        
        return answer;
    }
}