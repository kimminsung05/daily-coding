import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;        
        // 내가 가질 수 있는 마리 수 : nums.length / 2
        // 종류 수 : HashMap에서 중복없이 getOrDefault Cnt 넣어서
        // HashMap의 keySet으로 cnt가 0 보다 큰 거의 개수를 세서 리턴
        // 종류 수, 가질 수 있는 마리수 비교해서 더 적은걸 리턴
        int numCount = nums.length / 2;
        int kindCount = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int ponketmon : nums)
            map.put(ponketmon, map.getOrDefault(ponketmon, 0) + 1);
        
        // for문 안돌리고 map.keySet().size 가능
        for(int key : map.keySet()) {
            if(map.get(key) > 0) {
                kindCount++;
            }
        }
        
        answer = Math.min(numCount, kindCount);
        
        return answer;
    }
}