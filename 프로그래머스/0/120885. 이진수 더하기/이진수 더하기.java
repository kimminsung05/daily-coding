class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        int sum = num1 + num2;
        
        // int sum을 2진수로 변환 후 string 변환
        
        answer = Integer.toBinaryString(sum);
        
        return answer;
    }
}