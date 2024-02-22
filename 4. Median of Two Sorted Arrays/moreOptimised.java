class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Binary Search
        int min=Integer.MIN_VALUE,max=Integer.MAX_VALUE;
        int n=nums1.length,m=nums2.length;
        if(n>m) return findMedianSortedArrays(nums2,nums1);
        int l=0,r=n;
        while(l<=r){
            int mid=l+(r-l)/2;
            int cut1=mid;
            int cut2=(n+m+1)/2-cut1;

            int l1 = (cut1==0) ? min: nums1[cut1-1];
            int r1=(cut1==n) ? max : nums1[cut1];
            int l2 = (cut2==0) ? min: nums2[cut2-1];
            int r2=(cut2==m) ? max : nums2[cut2];

            if(l1<=r2 && l2<=r1){
                if((n+m)%2==0){
                    return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                }else{
                    return Math.max(l1,l2);
                }
            }else if(l1>r2){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return -1;
    }
}
