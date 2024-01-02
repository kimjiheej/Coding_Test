class Solution {
    public int solution(int i, int j, int k) {
        
        // 문자열로 바꾸어 주어라 
        
        int p;
        int total = 0;
        for(p=i; p<=j; p++)
        {
            String s = String.valueOf(p);
            String a = String.valueOf(k);
            
            // 11 의 경우도 생각해보기 
            if(s.contains(a))
            {
                char[] array = s.toCharArray();
                int q;
                for(q=0; q<array.length; q++)
                    if(String.valueOf(array[q]).equals(String.valueOf(a)))
                        total++;
            }
        }
        
        return total;
    }
}