class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] array = new int[numlist.length];
        
        int i,j;
        int k =0;
        
        for(i=0; i<numlist.length; i++){
            if(numlist[i] % n == 0)
                array[k++] = numlist[i];
        }
        
        int answer[] = new int[k];
        
        for(j=0; j<k; j++)
            answer[j] = array[j];
        
        return answer;
    }
}