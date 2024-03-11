class Solution {
    public static int solveMem(int[] coins,int amount,int[] dp){
        if(amount==0) return 0;
        if(amount<0) return Integer.MAX_VALUE;
        if(dp[amount]!=-1) return dp[amount];
        int mini= Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            int ans = solveMem(coins,amount-coins[i],dp);
            if(ans!=Integer.MAX_VALUE) mini=Math.min(mini,ans+1);
        }
        dp[amount]=mini;
        return mini;
    }

    public int coinChange(int[] coins, int amount) {
        // RECURSION + MEMOIZATION
        int dp[]=new int[amount+1];
        Arrays.fill(dp,-1);
        int ans = solveMem(coins,amount,dp);
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
}
