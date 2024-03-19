class Solution {
    public static boolean fun(String cs, String word) {
        if (cs.length() != word.length()) return false;
        int i, n = word.length();
        for (i = 0; i < n; i++) {
            if ((cs.charAt(i) != word.charAt(i)) && (cs.charAt(i) != ' ')) break;
        }
        if (i == n) return true;
        StringBuilder sb = new StringBuilder(cs);
        cs = sb.reverse().toString();
        for (i = 0; i < n; i++) {
            if ((cs.charAt(i) != word.charAt(i)) && (cs.charAt(i) != ' ')) break;
        }
        if (i == n) return true;
        return false;
    }

    public boolean placeWordInCrossword(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                while (j < n && board[i][j] == '#') j++;
                String cs = "";
                while (j < n && board[i][j] != '#') cs += board[i][j++];
                if (fun(cs, word)) return true;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                while (j < m && board[j][i] == '#') j++;
                String cs = "";
                while (j < m && board[j][i] != '#') cs += board[j++][i];
                if (fun(cs, word)) return true;
            }
        }
        return false;
    }
}
