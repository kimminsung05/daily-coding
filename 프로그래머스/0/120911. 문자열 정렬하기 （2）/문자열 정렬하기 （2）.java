import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        my_string = my_string.toLowerCase();
        
        List<String> strList = new ArrayList<>();
        for(int i=0; i<my_string.length(); i++) {
            strList.add(String.valueOf(my_string.charAt(i)));
        }
        strList.sort(null);
        
        for(int i=0; i<strList.size(); i++) {
            answer += strList.get(i);
        }
        
        return answer;
    }
}

// my_string lowerCase
// list로 변환해서 sort 다시 string 변환