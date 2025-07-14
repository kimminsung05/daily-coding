import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];     
        int[] tempArray = Arrays.copyOf(array, array.length);
        Arrays.sort(tempArray);

        int max = tempArray[(tempArray.length)-1];        
        int index = 0;
        
        for(int i=0; i<array.length; i++) {
            if(array[i] == max) index = i;
        }
        
        answer[0] = max;
        answer[1] = index;
        
        return answer;
    }
}