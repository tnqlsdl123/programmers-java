class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int num = 0;

        for (int t = 0; t < intStrs.length; t++) {
            String str = "";

            for (int i = s; i < s + l; i++) {
                str += intStrs[t].charAt(i);
            }

            int change = Integer.parseInt(str);

            if (change > k) {
                num++;
            }
        }

        int[] answer = new int[num];
        int index = 0;

        for (int t = 0; t < intStrs.length; t++) {
            String str = "";

            for (int i = s; i < s + l; i++) {
                str += intStrs[t].charAt(i);
            }

            int change = Integer.parseInt(str);

            if (change > k) {
                answer[index] = change;
                index++;
            }
        }

        return answer;
    }
}