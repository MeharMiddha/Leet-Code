class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        HashSet<Integer> set=new HashSet<Integer>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums1[i]==nums2[j]){
                    set.add(nums1[i]);
                    break;
                }
            }
        }
        int arr[]=new int[set.size()];
        int count=0;
        for(int num:set){
            arr[count]=num;
            count++;
        }
        return arr;
    }
}
