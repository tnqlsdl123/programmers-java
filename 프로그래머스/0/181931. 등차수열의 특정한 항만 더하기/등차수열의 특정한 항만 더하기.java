class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int num = 0;
        
        for (int k = a; k < a + d * included.length; k = k + d) {
                if (included[num] == true) {
                    answer += k;
                }
            num++;
            }
        
        return answer;
    }
}