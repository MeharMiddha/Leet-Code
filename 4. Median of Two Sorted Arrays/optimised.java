class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //2 Pointer
        int i=0,j=0;
        ArrayList<Integer> list = new ArrayList<>();
        int n=nums1.length,m=nums2.length;
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                list.add(nums1[i]);
                i+=1;
            }else{
                list.add(nums2[j]);
                j+=1;
            }
        }
        while(i<n){
            list.add(nums1[i]);
            i+=1;
        }
        while(j<m){
            list.add(nums2[j]);
            j+=1;
        }
        int med = list.size()/2;
        if(list.size()%2==0){
            return (list.get(med)+list.get(med-1))/2.0;
        }else{
            return list.get(med);
        }
    }
}
