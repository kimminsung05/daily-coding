import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        // 1. n을 2로 나눈다.
        // 2. 2로 안나눠지면 3.4.5... 로 나눈다 n까지
        // 3. 나눈걸 stirng에 담는다.
        // 4. n이 1이 될때까지 나눈다.
        List<Integer> list = new ArrayList<>();        
        for(int i=2; i<=n; i++) {
            if(n % i == 0) {
                list.add(i);
                while(n % i == 0) {
                    n /= i;
                }    
            }            
        }
        
        answer = new int[list.size()];
        for(int i=0; i<answer.length; i++)
            answer[i] = list.get(i);
        
        return answer;
    }
}