class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0,j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                j++;
                count+=j;
            }else{
                j=0;
            }
        }
        return count;
    }
}
