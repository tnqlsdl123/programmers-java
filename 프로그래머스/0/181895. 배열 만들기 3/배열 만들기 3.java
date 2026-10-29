class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = new int[intervals[0][1] - intervals[0][0] + intervals[1][1] - intervals[1][0] + 2];
        int k = 0;
        
        for(int i = 0; i <= intervals[0][1] - intervals[0][0]; i++) {
            answer[i] = arr[intervals[0][0] + i];
            k = i;
        }
        
        k++;
        
        for(int i = 0; i <= intervals[1][1] - intervals[1][0]; i++) {
            answer[k + i] = arr[intervals[1][0] + i];
        }
        
        return answer;
    }
}