class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        int i;
        
        for(i=0; i<my_string.length(); i++){
            if(!answer.contains(String.valueOf(my_string.charAt(i))))
                answer +=my_string.charAt(i);
        }
        return answer;
    }
}