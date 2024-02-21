class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int left[]=new int[n];
        int right[]=new int[n];
        for(int i=0;i<n;i++){
            left[i]=Math.max(i-1<0 ? 0 :left[i-1],height[i]);
        }
        for(int i=n-1;i>=0;i--){
            right[i]=Math.max(i+1>=n ? 0 :right[i+1],height[i]);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=Math.min(left[i],right[i])-height[i];
        }
        return ans;
    }
}
