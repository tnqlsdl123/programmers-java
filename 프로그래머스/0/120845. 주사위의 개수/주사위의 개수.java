class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
        int i = box[0] / n;
        int t = box[1] / n;
        int k = box[2] / n;
        
        answer = i * t * k;
        
        return answer;
    }
}