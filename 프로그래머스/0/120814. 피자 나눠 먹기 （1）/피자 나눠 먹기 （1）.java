class Solution {
    public int solution(int n) {
        int answer = 0;
                
        if(n >= 7 && n % 7 == 0) {
            answer = (n / 7);          
        } else if(n >= 7 && n % 7 != 0) {
            answer = (n / 7) + 1; 
        } else {
            answer = 1;
        }
        
        
        return answer;
    }
}

// 7명이 1판
// 8명은 2판
// 14명은 2판
// 15명은 3판
// 21까지는 3판
// 22부터는 4판