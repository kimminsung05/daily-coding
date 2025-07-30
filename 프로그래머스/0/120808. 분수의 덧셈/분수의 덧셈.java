class Solution {
    public int[] solution(int num1, int denom1, int num2, int denom2) {
        int num = num1 * denom2 + num2 * denom1;
        int denom = denom1 * denom2;
        
        int gcd = gcd(num, denom);

        num /= gcd;
        denom /= gcd;
        
        return new int[] {num, denom};
    }
    
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}