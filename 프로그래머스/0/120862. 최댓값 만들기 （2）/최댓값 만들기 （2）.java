import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        for(int i=0; i<numbers.length-1; i++) {
            for(int j=i; j<numbers.length; j++) {
                System.out.println("i = " + i + " / j = " + j + " / 곰셈 = " + numbers[i] * numbers[j]);
                if(i == 0 && j == 1) {
                    answer = numbers[i] * numbers[j];
                } else {
                    if(i == j) continue;
                    if(numbers[i] * numbers[j] > answer) answer = numbers[i] * numbers[j];
                }
            }
        }
        
        return answer;
    }
}