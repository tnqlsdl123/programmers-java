class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[(names.length + 5 - 1) / 5];
        int num = 0;
        
        for(int i = 0; i < names.length; i = i + 5) {
            answer[num] = names[i];
            num++;
        }
        
        return answer;
    }
}