class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(i==1){
                nums[i]=Math.max(nums[0],nums[1]);
            }else{
                nums[i]=Math.max(nums[i-1],nums[i]+nums[i-2]);
            }
        }
        return nums[nums.length-1];
    }
}
