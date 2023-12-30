class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        int t = n/10;
        
        answer = (n * 12000) + (k-t) * 2000;
        return answer;
    }
}