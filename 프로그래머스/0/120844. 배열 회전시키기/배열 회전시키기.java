import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        
        int first = numbers[numbers.length-1];
        int last = numbers[0];
        if(direction.equals("left")) {
            for(int i=0; i<numbers.length-1; i++) {
                numbers[i] = numbers[i+1];
            }
            numbers[numbers.length-1] = last;
        } else {
            for(int i=numbers.length-1; i>0; i--) {
                numbers[i] = numbers[i-1];
            }
            numbers[0] = first;
        }
        
        answer = numbers;
        
        return answer;
    }
}