class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[nums.length];
        int index = nums.length -1;
        while (left < right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[index] = nums[left] * nums[left];
                index--;
                left++;
            } else if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                result[index] = nums[right] * nums[right];
                index--;
                right--;
            } else {
                result[index] = nums[left] * nums[left];
                index--;
                result[index] = nums[left] * nums[left];
                index--;
                left++;
                right--;
            }
        }
        if (left == right) {
            result[index] = nums[left] * nums[left];
        }
        return result;
    }
}