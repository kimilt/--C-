class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        int result = 0;
        while (left <= right) {
            if (nums[left] == val) {
                while (nums[right] == val && right - 1 > left) {
                    right--;
                }
                if (nums[right] == val) {
                    right--;
                } else {
                    nums[left] = nums[right];
                    right--;
                    left++;
                    result++;
                }
            } else {
                left++;
                result++;
            }
        }
        return result;
    }
}