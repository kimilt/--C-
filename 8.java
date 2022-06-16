class Solution {
    public int myAtoi(String s) {
        int result = 0;
        boolean numbegin = false;
        boolean isneg = false;
        if (s.length() != 0) {
            for (int i = 0; i < s.length(); i++) {
                if (numbegin) {
                    if (Character.isDigit(s.charAt(i))) {
                        int digit = s.charAt(i) - '0';
                        if (!isneg) {
                            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                                return Integer.MAX_VALUE;
                            }
                            result = result * 10 + digit;
                        } else {
                            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && digit > -(Integer.MIN_VALUE % 10))) {
                                return Integer.MIN_VALUE;
                            }
                            if (result <= 9 && result >= 1) {
                                result = result * -1;
                            }
                            result = result * 10 - digit;
                        }
                    } else {
                        break;
                    }
                } else {
                    if (s.charAt(i) == '-') {
                        isneg = true;
                        numbegin = true;
                        continue;
                    } else if (s.charAt(i) == '+') {
                        numbegin = true;
                    } else if (Character.isDigit(s.charAt(i)) && s.charAt(i) != 0) {
                        numbegin = true;
                        result = s.charAt(i) - '0';
                    } else if (s.charAt(i) == ' '){
                        continue;
                    } else {
                        break;
                    }
                }
            }
        }
        return result;
    }
}