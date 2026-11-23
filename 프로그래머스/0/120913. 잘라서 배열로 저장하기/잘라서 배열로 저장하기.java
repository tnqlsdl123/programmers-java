class Solution {
    public String[] solution(String my_str, int n) {
        int leng = my_str.length() / n;
        
        if (my_str.length() % n != 0) {
            leng++;
        }
        
        String[] answer = new String[leng];
        
        for(int i = 0; i < leng; i++) {
            answer[i] = "";
            
            for(int t = 0; t < n; t++) {
                answer[i] += my_str.charAt(i * n + t);
                if (i * n + t == my_str.length() - 1) {
                    return answer;
                }
            }
        }
        
        return answer;
    }
}