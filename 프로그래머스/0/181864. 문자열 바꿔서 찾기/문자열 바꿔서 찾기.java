class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String changeMyString = "";
        
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'A'){
                changeMyString += "B";
            } else if (myString.charAt(i) == 'B') {
                changeMyString += "A";
            }
        }
        
        answer = changeMyString.contains(pat) ? 1 : 0;
        
        return answer;
    }
}