class Solution {
    public int[] solution(int n) {
        int num = 0;
        
        if (n % 2 == 0) {
            num = n / 2;
        } else {
            num = n / 2 + 1; 
        }
        
        int[] answer = new int[num];
        
        int array = 0;
        
        for (int i = 1; i <= n; i += 2) {
            answer[array] = i;
            array++;
        }
        
        return answer;
    }
}