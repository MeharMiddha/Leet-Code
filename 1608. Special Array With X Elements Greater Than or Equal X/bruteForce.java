class Solution {
    public int specialArray(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int a=nums[n-1];
        int count;
        for(int i=0;i<=a;i++){
            count=0;
            for(int j=0;j<n;j++){
                if(nums[j]>=i){
                    count++;
                }
            }
            System.out.print(count);
            if(count==i){
                return count;
            }
        }
        return -1;
    }
}
