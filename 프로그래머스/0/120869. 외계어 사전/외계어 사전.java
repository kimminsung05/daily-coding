import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        // spell을 정렬 후 문자열로 만들기
        char[] spellArr = String.join("", spell).toCharArray();
        Arrays.sort(spellArr);
        String sortedSpell = new String(spellArr);
        
        for (String word : dic) {
            char[] wordArr = word.toCharArray();
            Arrays.sort(wordArr);
            String sortedWord = new String(wordArr);
            
            if (sortedWord.equals(sortedSpell)) {
                return 1; // 일치하는 단어가 dic에 있음
            }
        }
        
        return 2; // 일치하는 단어 없음
    }
}