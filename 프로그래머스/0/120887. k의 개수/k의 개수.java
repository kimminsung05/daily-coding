class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        String compStr = String.valueOf(k);
        for(int var=i; var<=j; var++) {
            String nowStr = String.valueOf(var);
            for(int num=0; num<nowStr.length(); num++) {
                if(String.valueOf(nowStr.charAt(num)).equals(compStr))
                    answer++;
            }
        }
        
        return answer;
    }
}