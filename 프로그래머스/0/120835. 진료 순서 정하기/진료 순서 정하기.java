class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int max = 0;
        
        for(int i = 0; i < emergency.length; i++) {
            int rank = 1;
            
            for(int t = 0; t < emergency.length; t++) {
                if (emergency[i] < emergency[t]) {
                    rank++;
                }
            }
            
            answer[i] = rank;
        }
        
        
        
        return answer;
    }
}