class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0,j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count=count+i-j+1;
            }else{
                j=i+1;
            }
        }
        return count;
    }
}
