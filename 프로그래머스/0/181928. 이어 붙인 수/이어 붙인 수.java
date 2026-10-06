class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String stringResult1 = "";
        String stringResult2 = "";
        
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 1) {
                stringResult1 += String.valueOf(num_list[i]);
            } else {
                stringResult2 += String.valueOf(num_list[i]);
            }
        }
        
        
        answer = Integer.parseInt(stringResult1) + Integer.parseInt(stringResult2);
        
        return answer;
    }
}