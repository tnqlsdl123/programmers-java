class Solution {
    public int[][] solution(int[] num_list, int n) {
        int num = 0;
        
        int leng = num_list.length / n;
        
        int[][] answer = new int[leng][n];
        for (int i = 0; i < leng; i++) {
            for (int t = 0; t < n; t++) {
                answer[i][t] = num_list[num];
                num++;
            }
        }
        
        return answer;
    }
}