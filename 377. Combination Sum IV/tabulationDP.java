class Solution {
    public static int solveTab(int[] nums,int target){
        int dp[]=new int[target+1];
        dp[0]=1;
        for(int i=1;i<=target;i++){
            for(int j=0;j<nums.length;j++){
                if(i-nums[j]>=0){
                    dp[i]+=dp[i-nums[j]];
                }
            }
        }
        return dp[target];
    }

    public int combinationSum4(int[] nums, int target) {
        // Tabulation Approach
        return solveTab(nums,target);
    }
}
