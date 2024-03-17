class Solution {
    public int solution(int n) {
        
        int[] arr = new int[1000000];
        
         int cnt = 1;
        int index = 0;
        
        while(index < arr.length){
            String s = String.valueOf(cnt);
            if(cnt % 3 != 0 && !s.contains("3"))
                arr[index++] = cnt;
            cnt++;
        }
        
        return arr[n-1];
    }
}