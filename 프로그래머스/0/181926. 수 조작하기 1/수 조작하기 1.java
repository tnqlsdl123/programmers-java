class Solution {
    public int solution(int n, String control) {
        int answer = n;
        String line = "wsda";
        
        for (int i = 0; i < control.length(); i++) {
            if (control.charAt(i) == line.charAt(0)) {
                answer += 1;
            } else if (control.charAt(i) == line.charAt(1)) {
                answer -= 1;
            } else if (control.charAt(i) == line.charAt(2)) {
                answer += 10;
            } else if (control.charAt(i) == line.charAt(3)) {
                answer -= 10;
            }
        }
        
        return answer;
    }
}