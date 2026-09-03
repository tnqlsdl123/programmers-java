class Solution {
    public int solution(int n, int k) {
        int result = 0;
        int plusDrink;
        
        result = n * 12000;
        
        if (n >= 10) {
            plusDrink = n / 10;
            result += (k - plusDrink) * 2000;
        } else {
            result += k * 2000;
        }
        return result;
    }
}