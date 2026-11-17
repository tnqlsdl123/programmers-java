class Solution {
    public int[] solution(int[] arr) {
        int max = -1;
        int min = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                max = i;
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                min = i;
                break;
            }
        }
        
        if (max == -1 && min == -1) {
            int[] answer = new int [1];
            answer[0] = -1;
            return answer;
        }
        
        int[] answer = new int[max - min + 1];
        int num = 0;
        for (int i = min; i <= max; i++) {
            answer[num] = arr[i];
            num++;
        }
        
        return answer;
    }
}