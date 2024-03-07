class Solution {
    public static void solve(int[] nums, int index, List<List<Integer>> ans){
        if (index >= nums.length) {
            ArrayList<Integer> permutation = new ArrayList<>();
            for (int num : nums) {
                permutation.add(num);
            }
            ans.add(permutation);
            return;
        }
        for(int j=index;j<nums.length;j++){
            int temp=nums[index];
            nums[index]=nums[j];
            nums[j]=temp;
            solve(nums,index+1,ans);
            int a=nums[index];
            nums[index]=nums[j];
            nums[j]=a;
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int index=0;
        solve(nums,index,ans);
        return ans;
    }
}
