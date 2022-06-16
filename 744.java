class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        char result = 'z' + 1;
        while (left < right) {
            int i = (left + right) / 2;
            if (letters[i] > target) {
                result =  ((letters[i] < result) && letters[i] > target) ? letters[i] : result;
                right = i - 1;
            } else {
                left = i + 1;
            }
            if (left == right) {
                result = ((letters[left] < result) && letters[left] > target) ? letters[left] : result;
            }
        }
        if (result == 'z' + 1) {
            result = letters[0];
        }
        return result;
    }
}