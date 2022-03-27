class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> q1 = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (q1.containsKey(diff)) {
                return new int[] {i, q1.get(diff)};
            } else {
                q1.put(nums[i], i);
            }
        }
        return new int[] {0};
    }
}