import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int minNum = Math.min(sides[0], sides[1]);
        int maxNum = Math.max(sides[0], sides[1]);
        
        for(int i=maxNum; i>maxNum-minNum; i--) {
            answer++;
        }
        
        for(int i=maxNum+1; i<maxNum+minNum; i++) {
            answer++;
        }
        
        
        return answer;
    }
}

// 1. 가장 긴 변이 sides >> x > 6 - 3 x가 6일 때까지
// 2. 나머지 한 변이 가장 긴 경우 x < 6 + 3 , x > max