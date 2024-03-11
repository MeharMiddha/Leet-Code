class Solution {
    public static int solve(int[] nums){
        int n=nums.length;
        int prev2=0;
        int prev1=nums[0];
        for(int i=1;i<n;i++){
            int include=prev2+nums[i];
            int exclude = prev1+0;
            int ans = Math.max(include,exclude);
            prev2=prev1;
            prev1=ans;
        }
        return prev1;
    }

    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int first[]=new int[n];
        int second[]=new int[n];
        for(int i=0;i<n;i++){
            if(i!=n-1) first[i]=nums[i];
            if(i!=0) second[i]=nums[i];
        }
        return Math.max(solve(first),solve(second));
    }
}
