class Solution {
    public int solution(int n) {
        int answer = 0;
        int div = 1;
        int i = 1;
        
        while(true) {
            div = i*6;
            if(div % n == 0) {       
                answer = div / 6;
                break;
            }            
            i++;
        }
        
        return answer;
    }
}