class Solution {
    public int solveMem(int[] obstacles,int currLane,int currPos,int[][] dp){
        int n=obstacles.length-1;
        if(currPos==n) return 0;
        if(dp[currLane][currPos]!=-1) return dp[currLane][currPos];
        if(obstacles[currPos+1]!=currLane){
            return solveMem(obstacles,currLane,currPos+1,dp);
        }
        else{
            // sideways Jumps
            int ans = Integer.MAX_VALUE;
            for(int i=1;i<=3;i++){
                if(currLane!=i && obstacles[currPos]!=i){
                    ans = Math.min(ans,1+solveMem(obstacles,i,currPos,dp));
                }
            }
            dp[currLane][currPos]=ans;
            return dp[currLane][currPos];
        }
    }
    public int minSideJumps(int[] obstacles) {
        // Recursion + Memoization
        int[][] dp = new int[4][obstacles.length-1];
        for(int[] row: dp){
            Arrays.fill(row,-1);
        }
        return solveMem(obstacles,2,0,dp);
    }
}
