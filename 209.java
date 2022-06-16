class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int result = nums.length + 1;
        int sum = nums[0];
        while (right < nums.length && left <= right) {
            if (sum >= target) {
                int length = right - left + 1;
                if (length < result) {
                    result = length;
                }
                sum = sum - nums[left];
                left++;
            } else {
                right++;
                if (right >= nums.length) break;
                sum = sum + nums[right];
            }
        }
        return result < nums.length + 1 ? result : 0;
    }
}