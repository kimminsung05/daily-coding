class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int sum = 0;
        String numStr = "";
        
        for(int i=0; i<my_string.length(); i++) {
            if(Character.isDigit(my_string.charAt(i))) {
                numStr += String.valueOf(my_string.charAt(i));
            } else {
                if(!numStr.equals("")) {
                    sum += Integer.parseInt(numStr);   
                }                
                numStr = "";
            }
        }
        
        if(!numStr.equals("")) {
            sum += Integer.parseInt(numStr);
        }
        
        answer = sum;
        
        return answer;
    }
}