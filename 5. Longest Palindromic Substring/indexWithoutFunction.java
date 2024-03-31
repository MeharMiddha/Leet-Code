class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String str = s.substring(i, j);
                boolean flag = true; // Reset flag for each substring
                int left = 0;
                int right = str.length() - 1;
                while (left < right) {
                    if (str.charAt(left) != str.charAt(right)) {
                        flag = false;
                        break;
                    }
                    left++;
                    right--;
                }
                if (flag && str.length() > longest.length()) {
                    longest = str;
                }
            }
        }
        return longest;
    }
}
