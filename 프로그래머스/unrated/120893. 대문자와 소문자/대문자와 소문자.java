class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        char[] array = my_string.toCharArray();
        
        int i,j;
        
        String temp="";
        
        for(i=0; i<array.length; i++)
        {
            if(array[i] >=65 && array[i] <=90)
            {
                temp = array[i] +"";
                answer +=temp.toLowerCase();
            }
            else {
                temp = array[i] +"";
                answer +=temp.toUpperCase();
        }
        }
       
            return answer;
    
}
}