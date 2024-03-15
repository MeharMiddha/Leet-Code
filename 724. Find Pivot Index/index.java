class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum=0;
        for(int i=0;i<nums.length;i++){
            totalSum+=nums[i];
        }
        int left=0,index=-1;
        for(int i=0;i<nums.length;i++){
            if(left==totalSum-nums[i]-left){
                index=i;
                break;
            }
            left+=nums[i];
        }
        return index;
    }
}
