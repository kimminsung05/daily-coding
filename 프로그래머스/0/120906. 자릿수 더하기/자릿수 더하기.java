class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String a = ""+n;
                
        for(int i=0; i<a.length(); i++) {
            answer += a.charAt(i) - '0';
        }
        
        
        return answer;
    }
}