class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        
        int i,j;
        int k =0;
        int length = num_list.length / 2;
        
        for(i=0; i<num_list.length/n; i++)
        {
            for(j=0; j<n; j++)
                answer[i][j] = num_list[k++];
        }
                
        return answer;
    }
}