class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        int k;
        
        int i = s1.length;
        int j = s2.length;
        
        if(i>j)
            k = i;
        else 
            k = j;
        
        int p;
        int t;
        int total = 0;
        for(p=0; p<s1.length; p++){
            for(t=0; t<s2.length; t++)
                if(s1[p].equals(s2[t]))
                    total++;
        }
        return total;
    }
}