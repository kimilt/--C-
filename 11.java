class Solution {
    public int maxArea(int[] height) {
        int result = 0;
        int left = 0;
        int right = height.length - 1;
        while (left != right) {
            int bottom = right - left;
            int h = Math.min(height[left], height[right]);
            int area = bottom * h;
            if (area > result) {
                result = area;
            }
            if (height[left] >= height[right]) right--; else left++;
        }
        return result;
    }
}