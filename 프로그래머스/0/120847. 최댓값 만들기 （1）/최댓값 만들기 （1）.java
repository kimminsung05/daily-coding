import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        // 1번 문제풀이 (선택정렬)
        // for(int i=0; i<numbers.length-1; i++) {
        //     for(int j=i+1; j<numbers.length; j++) {
        //         if(numbers[i] > numbers[j]) {                    
        //             int temp = numbers[i];
        //             numbers[i] = numbers[j];                    
        //             numbers[j] = temp;
        //         }    
        //     }            
        // }
                
//         int max1 = numbers[numbers.length-1];
//         int max2 = numbers[numbers.length-2];

//         answer = max1 * max2;
        
        // 2번 문제풀이
        int minVal = Integer.MIN_VALUE;
        int maxVal = Integer.MIN_VALUE;
         
        for (int num : numbers) {
            if(num > minVal) {
                maxVal = minVal;
                minVal = num;
            } else if (num > maxVal) {
                maxVal = num;
            }
        }
        
        answer = minVal * maxVal;

        return answer;
    }
}