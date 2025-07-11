class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        for(int i=0; i<sides.length-1; i++) {
            for(int j=i+1; j<sides.length; j++) {
                if(sides[i] > sides[j]) {
                    int cnt = sides[i];
                    sides[i] = sides[j];
                    sides[j] = cnt;
                }
            }
        }

        if((sides[0] + sides[1]) > sides[2]) {
            answer = 1;
        } else {
            answer = 2;
        }
        
        return answer;
    }
}

// 가장 큰 변이 나머지 두 변보다 작아야만 삼각형 완성
// a < b+c