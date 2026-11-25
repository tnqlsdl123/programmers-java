class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int num1 = 0;
        int num2 = 0;
        
        for(int i = 0; i < bin1.length(); i++) {
            if (bin1.charAt(i) == '1') {
                num1 += (int) Math.pow(2, bin1.length() - i - 1);
            }
        }
        
        for(int i = 0; i < bin2.length(); i++) {
            if (bin2.charAt(i) == '1') {
                num2 += (int) Math.pow(2, bin2.length() - 1 - i);
            }
        }
        
        int sum = num1 + num2;
        String result = "";
        
        if(sum == 0) {
            return "0";
        }
        
        while(sum > 0) {
            result = (sum % 2) + result;
            sum /= 2;
        }
        
        return result;
    }
}