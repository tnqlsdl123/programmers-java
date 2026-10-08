class Solution {
    public String solution(String myString) {
        String answer = "";
        String changeMyString = "";
        
        changeMyString = myString.toLowerCase();
        
        answer = changeMyString.replace("a", "A");
        
        return answer;
    }
}