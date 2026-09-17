class Solution {
    public int[] solution(int[] arr) {
        int length = 0;
        
        for (int i = 0; i < arr.length; i++) {
            length += arr[i];
        }
        
        int[] answer = new int[length];
        int index = 0;
        
        for (int i = 0; i < arr.length; i++) {
            for (int t = 0; t < arr[i]; t++) {
                answer[index] = arr[i];
                index++;
                
            }    
        }
        
        return answer;
    }
}