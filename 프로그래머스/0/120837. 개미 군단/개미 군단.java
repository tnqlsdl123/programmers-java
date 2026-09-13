class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        int n = hp / 5;
        int t = hp % 5 / 3 ;
        int k = hp % 5 % 3;
        
        answer = n + t + k;
        
        return answer;
    }
}