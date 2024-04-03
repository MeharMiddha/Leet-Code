class Solution {
    public int solveTab(int[] satisfaction){
        int n = satisfaction.length;
        int[][] dp = new int[n+1][n+1];
        for(int index=n-1;index>=0;index--){
            for(int time=index;time>=0;time--){
                int include = satisfaction[index]*(time+1)+dp[index+1][time+1];
                int exclude = 0+dp[index+1][time];
                dp[index][time]=Math.max(include,exclude);
            }
        }
        return dp[0][0];
    }

    public int maxSatisfaction(int[] satisfaction) {
        // Tabulation : Bottom Up Approach
        Arrays.sort(satisfaction);
        return solveTab(satisfaction);
    }
}
