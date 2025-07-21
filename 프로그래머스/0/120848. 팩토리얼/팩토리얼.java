class Solution {
    public int solution(int n) {
        int answer = 0;
        int result = 1;
        
        while(result <= n) {
            result = result * (answer+1);
            answer++;
        }    
        if(result > n) answer -= 1;        
        
        return answer;
    }
}