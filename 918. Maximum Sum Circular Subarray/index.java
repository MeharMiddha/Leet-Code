class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total=0;
        int curr_max=0;
        int ans_max = Integer.MIN_VALUE;
        int curr_min=0;
        int ans_min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            curr_max = Math.max(curr_max+nums[i],nums[i]);
            ans_max=Math.max(curr_max,ans_max);
            curr_min = Math.min(curr_min+nums[i],nums[i]);
            ans_min=Math.min(ans_min,curr_min);
            total+=nums[i];
        }
        if(total==ans_min){
            return ans_max;
        }
        return Math.max(ans_max,total-ans_min);
    }
}
