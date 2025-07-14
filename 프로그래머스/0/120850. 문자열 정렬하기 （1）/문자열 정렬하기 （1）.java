import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        
        List<Integer> testList = new ArrayList<>();
        for(int i=0; i<my_string.length(); i++) {
            if(my_string.charAt(i) >= '0' && my_string.charAt(i) <= '9') {
                testList.add(my_string.charAt(i) - '0');
            }
        }
        
        answer = testList.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);
        
        return answer;
    }
}