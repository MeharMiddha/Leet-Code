class Solution {
    public static int solve(int[] nums,int target){
        if(target<0) return 0;
        if(target==0) return 1;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans+=solve(nums,target-nums[i]);
        }
        return ans;
    }

    public int combinationSum4(int[] nums, int target) {
        return solve(nums,target);
    }
}
