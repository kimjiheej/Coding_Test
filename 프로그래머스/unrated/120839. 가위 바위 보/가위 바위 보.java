class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        char[] array = rsp.toCharArray();
        
        int i;
        
        for(i=0; i<array.length; i++)
        {
            if(array[i] == '2')
            {
                answer += "0";
            }
            else if(array[i] == '0')
            {
                answer +="5";
            }
            else 
                answer += "2";
        }
        return answer;
    }
}