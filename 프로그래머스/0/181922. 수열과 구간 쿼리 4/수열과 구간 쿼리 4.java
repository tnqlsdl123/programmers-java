class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for(int i = 0; i < queries.length; i++) {
            for (int t = queries[i][0]; t <= queries[i][1]; t++) {
                if (t % queries[i][2] == 0) {
                    arr[t] += 1;
                }
            }
        }
        
        int[] answer = arr;
        
        return answer;
    }
}