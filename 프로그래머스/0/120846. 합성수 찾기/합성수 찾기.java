class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            int insu = 0;
            for (int t = 1; t <= i; t++) {
                if (i % t == 0) {
                    insu += 1;
                }
            }
            
            if (insu >= 3) {
                        answer += 1;
                    }
        }
        
        return answer;
    }
}