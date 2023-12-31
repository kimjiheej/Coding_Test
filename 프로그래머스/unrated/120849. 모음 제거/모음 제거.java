class Solution {
    public String solution(String my_string) {
        String answer = "";
        String answer1 = "";
        String answer2="";
        String answer3 = "";
        String answer4 = "";
        answer = my_string.replace("a","");
        answer1 = answer.replace("e","");
        answer2 = answer1.replace("i","");
        answer3 = answer2.replace("o","");
        answer4 = answer3.replace("u","");
        
        return answer4;
    }
}