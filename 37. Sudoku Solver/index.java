public class Solution {
    public static boolean solve(int i, int j, char[][] a) {
        if (i == 9){
            for(char e[]:a){
                for(char f:e){
                    System.out.print(f+" ");
                }
                System.out.println();
            }
            return true;
        }
        // System.out.println(i+" "+j+" => "+a[i][j]);
        int ni, nj;
        if (j == 8) {
            ni = i + 1;
            nj = 0;
        } else {
            ni = i;
            nj = j + 1;
        }
        if (a[i][j] == '.') {
            for (char val = '1'; val <= '9'; val++) { // Use char literals for values 1 to 9
                if (isSafe(i, j, a, val)) {
                    a[i][j] = val;
                    
                    if (solve(ni, nj, a)) {
                        return true;
                    }
                    // backtracking
                    a[i][j] = '.'; // Reset the cell with '0'
                }
            }
        } else {
            return solve(ni, nj, a);
        }
        return false;
    }

    public static boolean isSafe(int i, int j, char[][] a, char val) {
        for (int k = 0; k < 9; k++) {
            if (a[i][k] == val)
                return false;
            if (a[k][j] == val)
                return false;
        }
        int gridSi = (i / 3) * 3;
        int gridSj = (j / 3) * 3;
        for (int p = 0; p < 3; p++) {
            for (int q = 0; q < 3; q++) {
                if (a[gridSi + p][gridSj + q] == val)
                    return false;
            }
        }
        return true;
    }

    public static void solveSudoku(char[][] board) {
        solve(0, 0, board);
    }
}
