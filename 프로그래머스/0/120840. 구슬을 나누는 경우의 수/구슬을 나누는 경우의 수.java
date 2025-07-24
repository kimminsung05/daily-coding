class Solution {
//     public int solution(int balls, int share) {
//         int answer = 0;
//         int comp = balls - share;
        
//         answer = (int)(factorial(balls) / (factorial(comp) * factorial(share)));
        
//         return answer;
//     }
    
//     public long factorial(int num) {
//         long result = 1;
        
//         for(int i=2; i<=num; i++) {
//             result = result * i;
//         }
        
//         return result;
//     }
    public int solution(int balls, int share) {
        return (int) combination(balls, share);
    }

    public long combination(int n, int r) {
        if (r > n - r) r = n - r; // nCr == nC(n-r)
        long result = 1;

        for (int i = 1; i <= r; i++) {
            result *= (n - i + 1);
            result /= i;
        }

        return result;
    }
}