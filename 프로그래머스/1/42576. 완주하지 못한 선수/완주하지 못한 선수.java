import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
//         // 1. string[] sort 품
//         Arrays.sort(participant);
//         Arrays.sort(completion);
        
//         int i=0;
//         for(; i<completion.length; i++) {
//             if(!participant[i].equals(completion[i])) {
//                 break;
//             }
//         }    
        
        // 1. 해시 participant가 key count가 value
        // 2. 해시 completion가 key count가 value인 거를 빼서
        // 3. value가 1인 거를 찾아 리턴
        Map<String, Integer> map = new HashMap<>();
        for(String player : participant)
            map.put(player, map.getOrDefault(player, 0) + 1);
        
        for(String player : completion)
            map.put(player, map.get(player) - 1);
                    
        for(String key : map.keySet()) {
            if(map.get(key) == 1) {
                answer = key;
                break;
            }
        }
            
        
        return answer;
        // return participant[i];
    }
}