class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        int i = 0;
        
        for (int t = num1; t <= num2; t++) {
            answer[i] = numbers[t];
            i++;
        }    
        
        return answer;
    }
}