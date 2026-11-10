class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[0].length; y++) {
                if (x + y <= k) {
                    answer += board[x][y];
                }
            }
        }
        
        return answer;
    }
}