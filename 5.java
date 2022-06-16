class Solution {
    public String longestPalindrome(String s) {
        String modified = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1) {
                modified = modified + '*' + s.charAt(i) + '*';
            } else {
                modified = modified + '*' + s.charAt(i);
            }
        }
        s = modified;
        String result = s.charAt(1) + "";
        for (int i = 0; i < s.length(); i++) {
            int length = 1;
            String current = s.charAt(i) + "";
            while (i - length >= 0 && i + length < s.length()) {
                if (s.charAt(i-length) == s.charAt(i+length)) {
                    current = s.charAt(i-length) + current + s.charAt(i+length);
                    length++;
                } else {
                    break;
                }
            }
            if (current.length() > result.length()) {
                result = current;
            }
        }
        result = result.replaceAll("\\*","");
        return result;
    }
}