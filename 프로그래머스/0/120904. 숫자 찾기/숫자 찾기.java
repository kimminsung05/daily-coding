class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String str = String.valueOf(num);
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) - '0' == k) {
                answer = i+1;
                break;
            }
        }
        
        if(answer == 0) {
            answer = -1;
        }
        
        return answer;
    }
}