import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        
        List<Integer> putList = new ArrayList<>();
        
        for(int i=0; i<numlist.length; i++) {
            if(numlist[i] % n == 0) {
                putList.add(numlist[i]);
            }
        }
        
        answer = putList.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}