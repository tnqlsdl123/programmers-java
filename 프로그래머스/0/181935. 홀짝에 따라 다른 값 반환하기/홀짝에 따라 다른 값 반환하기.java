class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 0;
        
        if (n % 2 == 0){
            while (i <= n) {
                answer += i * i;
                i += 2;
            }
        } else {
            i = 1;
            while (i <= n){
                answer += i;
                i += 2;
            }
        }
        
        return answer;
    }
}