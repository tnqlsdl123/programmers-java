class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 2; 
        int fac = 1;
        
        while(true) {
            for(int i = 1; i <= num; i++) {
                fac *= i;
            }
            
            if (fac > n) {
                num = num - 1;
                break;
            } else if (fac == n) {
                break;
            } else {
                fac = 1;
                num++;
            }
        }
        
        answer = num;
        
        return answer;
    }
}