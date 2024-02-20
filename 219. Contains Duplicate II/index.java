class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i=0,j=0,n=nums.length;
        HashSet<Integer> set = new HashSet<>();
        while(j<n){
            if(j>k){
                set.remove(nums[i]);
                i++;
            }
            if(set.contains(nums[j])){
                return true;
            }
            set.add(nums[j]);
            j++;
        }
        return false;
    }
}
