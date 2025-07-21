import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int[] compArr = new int[array.length];
        int minIndex = 0;
        
        for(int i=0; i<array.length; i++) {
            if(array[i] > n) {
                compArr[i] = array[i] - n;
            } else {
                compArr[i] = n - array[i];
            }
        }
        
        for(int i=1; i<compArr.length; i++) {
            if(compArr[i] < compArr[minIndex]) {
                minIndex = i;
            } else if (compArr[i] == compArr[minIndex] 
                       && array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        
        answer = array[minIndex];
        
        return answer;
    }
}