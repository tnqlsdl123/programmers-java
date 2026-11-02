class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        int count = 0;
        
        String str = String.valueOf(num);
        
        while(true) {
            if (str.charAt(count) - '0' == k) {
                answer = count + 1;
                break;
            } else {
                count++;
            }
            
            if  (count >= str.length()) {
                answer = -1;
                break;
            }
        }
        
        return answer;
    }
}