import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        // 1. 해시맵을 만든다.
        Map<String, Integer> map = new HashMap<>();
        for(String num : phone_book) {
            map.put(num, 1);
        }
        
        // 2. 모든 전화번호가 해시맵에 있는 번호인지 확인하다.
        for(int i=0; i<phone_book.length; i++) {
            for(int j=1; j<phone_book[i].length(); j++) {
                if(map.containsKey(phone_book[i].substring(0, j)))
                    return false;
            }
        }
        
        // 3. 여기까지 왔는데 없다면 return true        
        return true;
    }
}