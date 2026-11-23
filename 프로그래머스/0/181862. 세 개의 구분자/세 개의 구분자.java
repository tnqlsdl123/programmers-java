import java.util.Arrays;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        
        String[] sp = myStr.split("[abc]");
        
        answer = Arrays.stream(sp).filter(s -> !s.isEmpty()).toArray(String[]::new);
        
        if(answer.length == 0) {
            answer = new String[1];
            answer[0] = "EMPTY";
        }
        
        return answer;
    }
}