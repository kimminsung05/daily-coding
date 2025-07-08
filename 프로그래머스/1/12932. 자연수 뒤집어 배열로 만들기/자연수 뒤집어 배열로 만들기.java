import java.util.*;

class Solution {
    public int[] solution(long n) {        
        String convertStr = ""+ n;
        int[] answer = new int[convertStr.length()]; 
        int cnt = 0;
        
        while (n > 0) {
            answer[cnt] = (int)(n%10);
            n /= 10;
            cnt++;
        }
                
        return answer;
    }
}