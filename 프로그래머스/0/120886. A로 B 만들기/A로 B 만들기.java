import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] str1 = before.toCharArray();
        char[] str2 = after.toCharArray();
        
        Arrays.sort(str1);
        Arrays.sort(str2);
        
        if (Arrays.equals(str1, str2)) {
            answer = 1;
        }
        
        return answer;
    }
}