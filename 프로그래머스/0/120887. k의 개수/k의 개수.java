class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for (int a = i; a <= j; a++) {
            String str = String.valueOf(a);
            String target = String.valueOf(k);
            
            for (int b = 0; b < str.length(); b++) {
                if (str.charAt(b) == target.charAt(0)) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}