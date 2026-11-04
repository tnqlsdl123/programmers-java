class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        
        boolean y1 = x1 || x2;
        boolean y2 = x3 || x4;
        answer = y1 && y2;
        
        return answer;
    }
}