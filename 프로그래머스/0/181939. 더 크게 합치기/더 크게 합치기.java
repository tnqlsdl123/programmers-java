class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String stringResult1 = String.valueOf(a) + String.valueOf(b);
        String stringResult2 = String.valueOf(b) + String.valueOf(a);
        
        int result1 = Integer.parseInt(stringResult1);
        int result2 = Integer.parseInt(stringResult2);
        
        answer = result1 >= result2 ? result1 : result2;
        
        return answer;
    }
}