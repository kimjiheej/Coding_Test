class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        char[] str = my_string.toCharArray();
        char[] str1 = new char[my_string.length()];
        
        int i;
        
        for(i=0; i<str.length; i++)
            str1[i] = str[str.length-1-i];
        
        answer = new String(str1);
        
        return answer;
    }
}