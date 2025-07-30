import java.util.*;

class Solution {
    public String solution(String number, int k) {
        List<String> list = new ArrayList<>();
        int remaining = k;
        
        for (int i = 0; i < number.length(); i++) {
            String digit = number.substring(i, i + 1);

            while (!list.isEmpty() && remaining > 0 && list.get(list.size() - 1).compareTo(digit) < 0) {
                list.remove(list.size() - 1);
                remaining--;
            }
            
            list.add(digit);
        }

        while (remaining-- > 0) {
            list.remove(list.size() - 1);
        }

        String answer = "";
        for (String s : list) {
            answer += s;
        }
        
        return answer;
    }
}