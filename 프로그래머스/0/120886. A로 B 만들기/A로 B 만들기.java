import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] bf = before.toCharArray();
        char[] af = after.toCharArray();
        
        Arrays.sort(bf);
        Arrays.sort(af);
        
        answer = Arrays.equals(bf, af) ? 1 : 0;
        
        
        return answer;
    }
}