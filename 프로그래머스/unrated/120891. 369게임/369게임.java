class Solution {
    public int solution(int order) {

        
        String answer = Integer.toString(order);
        String[] arr = answer.split("");
        
        int i;
        int total = 0;
        
        for(i=0; i<arr.length; i++)
        {
            if(arr[i].equals("3") || arr[i].equals("6") || arr[i].equals("9"))
                total++;
        }
        return total;
    }
}