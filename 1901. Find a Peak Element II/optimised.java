class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int i=0,j=0;
        int n=mat.length,m=mat[0].length;
        while(i<n && j<m){
            if(i-1>=0 && mat[i-1][j]>mat[i][j]){
                i--;
            }
            else if(j-1>=0 && mat[i][j-1]>mat[i][j]){
                j--;
            }
            else if(i+1<n && mat[i+1][j]>mat[i][j]){
                i++;
            }
            else if(j+1<m && mat[i][j+1]>mat[i][j]){
                j++;
            }
            else{
                return new int[]{i,j};
            }
        }
        return new int[0];
    }
}
