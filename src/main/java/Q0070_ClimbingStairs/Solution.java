package Q0070_ClimbingStairs;

class Solution {
    public int climbStairs(int n) {
        if (n < 3) {
            return n;
        }
        int a = 1, b = 2;
        for (int i = 2; i < n; i++) {
            a += b;
            // a, b = b, a
            int temp = a;
            a = b;
            b = temp;
        }
        return b;
    }
}