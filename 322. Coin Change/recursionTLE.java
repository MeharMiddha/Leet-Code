class Solution {
    public static int solveRec(int[] coins,int amount){
        if(amount==0) return 0;
        if(amount<0) return Integer.MAX_VALUE;
        int mini= Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            int ans = solveRec(coins,amount-coins[i]);
            if(ans!=Integer.MAX_VALUE) mini=Math.min(mini,ans+1);
        }
        return mini;
    }

    public int coinChange(int[] coins, int amount) {
        int ans = solveRec(coins,amount);
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
}
