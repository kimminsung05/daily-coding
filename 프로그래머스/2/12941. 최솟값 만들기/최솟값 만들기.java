import java.util.Arrays;

class Solution {
    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        int answer = 0;
        int N = A.length;
        for (int i = 0; i < N; i++) {
            answer += A[i] * B[N - 1 - i];
        }

        return answer;
    }
}