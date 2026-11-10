class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        
        for (int i = 0; i < my_strings.length; i++) {
            for (int x = parts[i][0]; x < parts[i][1] + 1; x++) {
                answer += my_strings[i].charAt(x);
            }
        }
        
        return answer;
    }
}