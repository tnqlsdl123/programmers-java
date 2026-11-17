import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        for (int i = 0; i < s.length(); i++) {
            int count = 0; 
            
            for (int t = 0; t < s.length(); t++) {
                if (s.charAt(i) == s.charAt(t)) {
                    count++;
                }
            }
            
            if (count == 1) {
                answer += s.charAt(i);
            }
        }
        char[] chr = answer.toCharArray();
        
        Arrays.sort(chr);
        
        return new String(chr);
    }
}