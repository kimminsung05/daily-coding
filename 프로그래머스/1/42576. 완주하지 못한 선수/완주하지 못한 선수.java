import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        // 1. 두 배열을 정렬
        // 2. 두 배열이 다를 때 까지 찾는다.
        // 3. 마지막까지 돌았는데도 못찾았다면? 마지막에 있는애가 범인
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        int i=0;
        for(; i<completion.length; i++) {
            if(!participant[i].equals(completion[i])) {
                break;
            }
        }        
        System.out.println("i => " + i);
        
        return participant[i];
    }
}