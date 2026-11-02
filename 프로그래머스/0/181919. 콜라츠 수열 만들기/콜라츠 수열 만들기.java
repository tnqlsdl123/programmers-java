class Solution {
    public int[] solution(int n) {
        int count = 1; 
        int same = n;
        
        while(same != 1) {
            if (same % 2 == 0) {
                same /= 2;
                count++;
            } else {
                same = 3 * same + 1;
                count++;
            }
        }
        int[] answer = new int[count];
        count = 1;
        
        answer[0] = n;
        while(n != 1) {
            if (n % 2 == 0) {
                answer[count] = n / 2;
                n /= 2;
                count++;
            } else {
                answer[count] = 3 * n + 1;
                n = 3 * n + 1;
                count++;
            }
        }
        
        return answer;
    }
}