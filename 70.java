class Solution {
    public int climbStairs(int n) {
        int result = 0;
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            int add1 = 1;
            int add2 = 2;
            for (int i = 3; i <= n; i++) {
                result = add1 + add2;
                add1 = add2;
                add2 = result;
            }
            return result;
        }
    }
}