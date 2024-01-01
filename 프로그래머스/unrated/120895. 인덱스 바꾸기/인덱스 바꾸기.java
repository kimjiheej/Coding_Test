class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        char[] array = my_string.toCharArray();
        
        char a = my_string.charAt(num1);
        char b = my_string.charAt(num2);
        
        array[num1] = b;
        array[num2] = a;
        
        
        int i;
        
        for(i=0; i<array.length; i++)
            answer += array[i];
        
        return answer;
    }
}