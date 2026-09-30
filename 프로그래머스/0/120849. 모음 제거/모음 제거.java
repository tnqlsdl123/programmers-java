class Solution {
    public String solution(String my_string) {
        String answer = "";
        String line = "aeiou";

        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) != line.charAt(0)
                    && my_string.charAt(i) != line.charAt(1)
                    && my_string.charAt(i) != line.charAt(2)
                    && my_string.charAt(i) != line.charAt(3)
                    && my_string.charAt(i) != line.charAt(4)) {

                answer += my_string.charAt(i);
            }
        }

        return answer;
    }
}