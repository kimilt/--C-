class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = -1, length = 0, result = 0;
        Map<Character, Integer> charset = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!charset.containsKey(s.charAt(i))) {
                charset.put(s.charAt(i), i);
                length++;
                right++;
            } else {
                int i0 = charset.get(s.charAt(i));
                charset.put(s.charAt(i), i);
                if (i0 >= left && i0 <= right) {
                    left = i0 + 1;
                    right = i;
                    if (length > result) {
                        result = length;
                    }
                    length = right - left + 1;
                } else {
                    charset.put(s.charAt(i), i);
                    length++;
                    right++;
                }
            }
        }
        if (length > result) {
            result = length;
        }
        return result;
    }
}