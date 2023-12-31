class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        char[] array1 = my_string.toCharArray();
        
        int i;
        int j;
        int total = 0;
        
        for(i=0; i<array1.length; i++){
            if(array1[i]> '0' && array1[i]<='9'){
                total +=array1[i] - '0';
            }
        }
    
        return total;
        
        
    }
}