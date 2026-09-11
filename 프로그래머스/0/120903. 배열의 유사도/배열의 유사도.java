class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        for (int i = 0; i < s1.length; i++) {
            for (int t = 0; t < s2.length; t++) {
                if (s1[i].equals(s2[t])) {
                    answer += 1;
                }
            }
        }
        
        return answer;
    }
}