class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int i=0,j=0,c=0,ans=0;
        while(j<n){
            if(nums[j]==0) c++;
            while(c>1){
                if(nums[i]==0) c--;
                i++;
            }
            int currentWindowSize = j-i+1-c;
            ans= Math.max(ans,currentWindowSize); 
            j++;
        }
        return (ans==n) ?n-1:ans;
    }

}
