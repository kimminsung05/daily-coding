class Solution {
    public int solution(int hp) {
        int answer = 0;
        int hp5 = 0;
        int hp3 = 0;
        int hp1 = 0;
        
        if( hp >= 5) {
            hp5 = hp / 5;
            hp %= 5;
            if(hp >= 3) {
                hp3 = hp / 3;
                hp %= 3;
                if(hp >= 1) {                    
                    hp1 = hp;
                }
            } else {
                hp1 = hp;
            }
        } else if( hp >= 3 && hp < 5 ) {
            hp3 = hp / 3;
            hp %= 3;
            if(hp >= 1) {
                hp1 = hp;
            }
        } else if( hp < 3 ) {
            hp1 = hp;
        }
        
        answer = hp5 + hp3 + hp1;
        
        return answer;
    }
}