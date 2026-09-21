class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int array = 0;
        
        for (int i = 0; i < finished.length; i++) {
            if (finished[i] == false) {
                array++;
            }
        }
        
        String[] answer = new String[array];
        int num = 0;
        
        for (int i = 0; i < todo_list.length; i++) {
            if (finished[i] == false) {
                answer[num] = todo_list[i];
                num++;
            }
        }
        
        return answer;
    }
}