class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0,j=0,ans=0,n=nums.length,occurence=0;
        while(j<n){
            if(nums[j]==0){
                occurence++;
            }
            j++;
            while(occurence>k){
                if(nums[i]==0) occurence--;
                i++;
            }
            ans=Math.max(ans,j-i);
        }
        return ans;
    }
}
