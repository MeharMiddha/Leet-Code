class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int ans[]=new int[n];
        int max;
        for(int i=0;i<n-1;i++){
            max=0;
            for(int j=i+1;j<n;j++){
                max=Math.max(max,arr[j]);
            }
            ans[i]=max;
        }
        ans[n-1]=-1;
        return ans;
    }
}
