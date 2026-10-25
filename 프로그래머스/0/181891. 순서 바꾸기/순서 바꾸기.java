class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int num = num_list.length - n;
        
        
        for (int i = 0; i < num; i++) {
            answer[i] = num_list[n + i];
        }
        
        for (int i = num; i < answer.length; i++) {
            answer[i] = num_list[i - num];
        }
        
        return answer;
    }
}