class Solution {
    public static int solveMem(int[] days,int[] costs,int index,int[] dp){
        int n=days.length;
        if(index>=n) return 0;
        if(dp[index]!=-1) return dp[index];
        // 1 day pass
        int option1 = costs[0]+solveMem(days,costs,index+1,dp);
        // 7 day pass;
        int i;
        for(i=index;i<n && days[i]<days[index]+7;i++);
        int option2 = costs[1]+solveMem(days,costs,i,dp);
        // 30 days pass
        for(i=index;i<n && days[i]<days[index]+30;i++);
        int option3=costs[2]+solveMem(days,costs,i,dp);
        
        dp[index]=Math.min(option1,Math.min(option2,option3));
        return dp[index];
    }

    public int mincostTickets(int[] days, int[] costs) {
        // Recursion + Memoization
        int dp[]=new int[days.length+1];
        Arrays.fill(dp,-1);
        return solveMem(days,costs,0,dp);
    }
}
