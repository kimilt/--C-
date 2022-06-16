class Solution {
    public int countPrimeSetBits(int left, int right) {
        int result = 0;
        for (int i = left; i <= right; i++) {
            int count1 = Integer.bitCount(i);
            int mask = 0b100010100010100010101100;
            if ((1 << count1 & mask) != 0) {
                result++;
            }
        }
        return result;
    }
}