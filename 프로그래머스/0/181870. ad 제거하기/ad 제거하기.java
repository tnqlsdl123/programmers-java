class Solution {
    public String[] solution(String[] strArr) {
        int num = 0;
        
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].contains("ad")) {
                num++;
            }
        }
        
        String[] answer = new String[strArr.length - num];
        int k = 0;
        
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].contains("ad")) {
                continue;
            } else {
                answer[k] = strArr[i];
                k++;
            }
        }
        
        return answer;
    }
}