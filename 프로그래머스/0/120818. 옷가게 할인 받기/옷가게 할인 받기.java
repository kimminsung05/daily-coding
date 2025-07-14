class Solution {
    public int solution(int price) {
        int answer = 0;
        
        int discount = (price >= 500000) ? 80 : (price >= 300000) ? 90 : (price >= 100000) ? 95 : 100;
        
        answer = (price * discount) / 100;
        
        
        return answer;
    }
}

// price >= 100,000 5%
// price >= 300,000 10%
// price >= 500,000 20%