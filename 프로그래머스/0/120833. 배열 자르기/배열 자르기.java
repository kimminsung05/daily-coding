import java.util.*;
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = numbers;                        
        
        answer = Arrays.copyOfRange(answer, num1, num2+1);
        
        return answer;
    }
}