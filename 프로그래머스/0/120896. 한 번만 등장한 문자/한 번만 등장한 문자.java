import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            
            if(s.indexOf(ch) == s.lastIndexOf(ch))
                answer += ch;
        }
        
        char[] arr = answer.toCharArray();
        Arrays.sort(arr);
        
        answer = new String(arr);
        
        return answer;
    }
}