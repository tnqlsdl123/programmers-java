class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int delete = 0;
        
        for(int i = 0; i < delete_list.length; i++) {
            for(int k = 0; k < arr.length; k++) {
                if (arr[k] == delete_list[i]) {
                    delete++;
                }
            }
        }
        
        int leng = arr.length - delete;
        int[] answer = new int[leng];
        int num = 0;
        
        for(int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int k = 0; k < delete_list.length; k++) {
                if (arr[i] == delete_list[k]) {
                    found = true;
                    break;
                }
            }
            
            if (!found){
                answer[num] = arr[i];
                num++;   
            }
        }
        
        return answer;
    }
}