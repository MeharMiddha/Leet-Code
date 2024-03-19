class Solution {
    public int solveTab(int[] values){
        int n=values.length;
        int dp[][]=new int[n+1][n+1];
        for(int i=n-1;i>=0;i--){
            for(int j=i+2;j<n;j++){
                int ans=Integer.MAX_VALUE;
                for(int k=i+1;k<j;k++){
                    ans=Math.min(ans,values[i]*values[j]*values[k]+dp[i][k]+dp[k][j]);
                }
                dp[i][j]=ans;
            }
        }
        return dp[0][n-1];
    }

    public int minScoreTriangulation(int[] values) {
        // Tabulation DP Approach
        return solveTab(values);
    }
}
