import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] a = {};        
        a = my_string.split(" ");
        answer = Integer.parseInt(a[0]);        
        
        for(int i=1; i<a.length; i+=2) {
            if(a[i].equals("+")) {
                answer += Integer.parseInt(a[i+1]);
            } else if(a[i].equals("-")) {
                answer -= Integer.parseInt(a[i+1]);
            }
        }
        
        
        return answer;
    }
}