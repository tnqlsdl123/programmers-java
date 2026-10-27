class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        int remove = 0;
        
        for (int i = 0; i < my_string.length(); i++) {
            remove = 0; 
            
            for (int t = 0; t < indices.length; t++) {
                if (i == indices[t]) {
                    remove = 1;
                    break;
                } 
            }
            
            if (remove == 0) {
                answer += my_string.charAt(i);   
            }
        }
        
        return answer;
    }
}