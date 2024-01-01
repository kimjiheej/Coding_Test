class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        char[] array = cipher.toCharArray();
        
        int i;
        int k = 1;
        int j = code;
        int total = 1;
        for(i=0; i<array.length; i++){
            if((i+1) % code == 0)
                answer += array[i];
        }
        return answer;
    }
}