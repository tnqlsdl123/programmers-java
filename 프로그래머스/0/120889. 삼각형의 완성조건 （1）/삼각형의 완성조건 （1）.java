class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int longest = sides[0];
        int sum = sides[0] + sides[1] + sides[2];
        
        if (sides[1] > longest) {
            longest = sides[1];
        }
        
        if (sides[2] > longest) {
            longest = sides[2];
        }
        
        if (longest < sum - longest) {
            answer = 1;
        } else {
            answer = 2;
        }
        
        return answer;
    }
}