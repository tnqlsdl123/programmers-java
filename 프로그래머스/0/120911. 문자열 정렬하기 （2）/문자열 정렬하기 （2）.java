import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        my_string = my_string.toLowerCase();
        
        char[] arr = my_string.toCharArray();
        Arrays.sort(arr);
        
        for(int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        
        return answer;
    }
}