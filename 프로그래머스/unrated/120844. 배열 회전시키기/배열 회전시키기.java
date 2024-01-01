class Solution {
    public int[] solution(int[] numbers, String direction) {
        int a;
        int b; 
        int temp;

        if(direction.equals("right"))
        {
           a = numbers[numbers.length-1];
            int i;
            for(i=numbers.length-1; i>0; i--)
                numbers[i] = numbers[i-1];
                 numbers[0] = a;
        }
        else 
        {
            a = numbers[0];
            
            int j;
            
            for(j=0; j<numbers.length-1; j++)
                numbers[j] = numbers[j+1];
            numbers[numbers.length-1] = a;
        }
        return numbers;
    }
}