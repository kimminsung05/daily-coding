import java.util.*;
class Solution {
    public String solution(int age) {
        String answer = "";
        char[] c = new char[String.valueOf(age).length()];
        
        for(int i=0; i<c.length; i++) { 
            c[i] = (char)('a' + (String.valueOf(age).charAt(i) -'0'));
        }
        
        answer = new String(c);
        
        
        return answer;
    }
}