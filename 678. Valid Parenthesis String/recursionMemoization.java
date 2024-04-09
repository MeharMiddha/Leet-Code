import java.util.*;

class Solution {
    public static boolean isValid(int i, int openCount, String s, int[][] dp) {
        int n = s.length();
        if (i == n) return (openCount == 0);
        if (dp[i][openCount] != -1) return dp[i][openCount] == 1;
        boolean valid = false;
        if (s.charAt(i) == '*') {
            valid = isValid(i + 1, openCount + 1, s, dp) || (openCount > 0 && isValid(i + 1, openCount - 1, s, dp)) || isValid(i + 1, openCount, s, dp);
        } else {
            if (s.charAt(i) == '(') valid = isValid(i + 1, openCount + 1, s, dp);
            else if (openCount > 0) valid = isValid(i + 1, openCount - 1, s, dp);
        }
        dp[i][openCount] = valid ? 1 : 0;
        return valid;
    }
    
    public boolean checkValidString(String s) {
        int n = s.length();
        int[][] dp = new int[n][n + 1];
        for (int[] row : dp) Arrays.fill(row, -1);
        return isValid(0, 0, s, dp);
    }
}
