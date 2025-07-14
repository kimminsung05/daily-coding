class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
        for(int i=0; i<box.length; i++) {
            box[i] /= n;        
        }
        answer = box[0] * box[1] * box[2];
        
        return answer;
    }
}