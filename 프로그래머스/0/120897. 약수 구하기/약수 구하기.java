import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};        
        int count = 0;
        
        List<Integer> cntList = new ArrayList<>();
        for(int i=1; i<n+1; i++) {
            if(n % i == 0) {
                count++;
                cntList.add(n/i);
            }
        }
        
        answer = new int[count];
        cntList.sort(null);
        
        answer = cntList.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}