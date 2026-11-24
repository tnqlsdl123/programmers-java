import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer = array[0];
        
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(answer - n) > Math.abs(array[i] - n)) {
                answer = array[i];
            }
        }
        
        return answer;
    }
}