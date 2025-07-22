class Solution {
    public String[] solution(String my_str, int n) {
        int strLength = my_str.length();
        int splitNum = (strLength % n == 0) ? strLength/n : (strLength/n) + 1;   
        String[] answer = new String[splitNum];        
        
        for(int i=0; i<answer.length; i++) {
            int start = i * n;
            int end = start + n;
            
            if(end > strLength) {
                end = strLength;
            }
            
            answer[i] = my_str.substring(start, end);            
        }        

        return answer;
    }
}