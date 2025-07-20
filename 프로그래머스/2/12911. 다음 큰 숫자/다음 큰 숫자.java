class Solution {
    public int solution(int n) {
        int targetCount = 0;
        int temp = n;
        while (temp > 0) {
            if (temp % 2 == 1) targetCount++;
            temp = temp / 2;
        }

        int next = n + 1;

        while (true) {
            int count = 0;
            int t = next;
            while (t > 0) {
                if (t % 2 == 1) count++;
                t = t / 2;
            }
            if (count == targetCount) {
                return next;
            }
            next++;
        }
    }
}