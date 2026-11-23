import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < flag.length; i++) {
            if (flag[i] == true) {
                for(int t = 0; t < arr[i] * 2; t++) {
                    answer.add(arr[i]);
                }
            } else {
                for(int t = 0; t < arr[i]; t++) {
                    answer.remove(answer.size() - 1);
                }
            }
        }
        
        int[] result = new int[answer.size()];
        for(int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        
        return result;
    }
}