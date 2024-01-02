class Solution {
    public String solution(String letter) {
        
        String[] array = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String answer = "";
        
        String[] str = letter.split(" ");
        
        int i,j;
        
        for(i=0; i<str.length; i++)
            for(j=0; j<array.length;j++)
                if(str[i].equals(array[j]))
                    answer += (char)(j+'a');
        
        return answer;
    }
}