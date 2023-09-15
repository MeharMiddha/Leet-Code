class Solution {
    public int largestAltitude(int[] gain) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        int n=gain.length;
        for(int i=0;i<n;i++){
            sum=sum+gain[i];
            max=Math.max(max,sum);
        }
        int ans=0;
        max=Math.max(max,ans);
        return max;
    }
}
