class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
         int i = box[0] / n;
        int j = box[1] / n;
         int p = box[2] / n;
        
        answer = i * j * p;
        
        return answer;
        
        
    }
}