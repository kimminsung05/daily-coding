class Solution {
    public long solution(String numbers) {
        long answer = 0;
        
        String[] words = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        
        for (int i = 0; i < words.length; i++) {
            numbers = numbers.replaceAll(words[i], String.valueOf(i));
        }
        
        answer = Long.parseLong(numbers);
        
        return answer;
    }
}