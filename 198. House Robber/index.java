class Solution {
    public static int solve(int nums[]){
        int n=nums.length;
        int prev=0;
        int curr=0;
        for(int i=0;i<n;i++){
            int temp=Math.max(prev+nums[i],curr);
            prev=curr;
            curr=temp;
        }
        return curr;
    }

    public int rob(int[] nums) {
        return solve(nums);
    }
}
