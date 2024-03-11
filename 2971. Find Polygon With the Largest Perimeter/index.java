class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long currentSum=0;
        long perimeterSum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<currentSum){
                perimeterSum = currentSum + nums[i];
            }
            currentSum += nums[i];
        }
        return (perimeterSum == 0) ? -1 : perimeterSum;
    }
}
