class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int ans[]=new int[n+m];
        int index=0;
        for(int i=0;i<n;i++){
            ans[index]=nums1[i];
            index++;
        }
        for(int i=0;i<m;i++){
            ans[index]=nums2[i];
            index++;
        }
        Arrays.sort(ans);
        if ((n + m) % 2 == 0) {
            int a = (n + m) / 2;
            int b = a - 1;
            return (ans[a] + ans[b]) / 2.0;
        } else {
            int c = (n + m) / 2;
            return ans[c];
        }
    }
}
