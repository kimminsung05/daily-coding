import java.util.*;
class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = {};
        
        List<Integer> testList = new ArrayList<>();
        
        for(int i=0; i<strlist.length; i++) {
            testList.add(strlist[i].length());
        }
        
        answer = testList.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}