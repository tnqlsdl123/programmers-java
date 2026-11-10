class Solution {
    public int solution(int[][] arr) {
        int answer = 1;
        int i = arr.length;
        int j = arr[0].length;
        
        for (int x = 0; x < i; x++) {
            for (int y = 0; y < j; y++) {
                if (arr[x][y] != arr[y][x]) {
                    answer = 0;
                    break;
                }
            }
        }
        
        return answer;
    }
}